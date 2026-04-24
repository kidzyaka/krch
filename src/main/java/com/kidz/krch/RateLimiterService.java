package com.kidz.krch;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class RateLimiterService {

    private final Map<String, Bucket> cache = new ConcurrentHashMap<>();
    private static final long REQUESTS_LIMIT = 25;
    private static final Duration TIME_WINDOW = Duration.ofMinutes(1);


    private Bucket resolveBucket(String ip) {
        return cache.computeIfAbsent(ip, k -> createNewBucket());
    }


    private Bucket createNewBucket() {
        Bandwidth limit = Bandwidth.classic(REQUESTS_LIMIT, Refill.intervally(REQUESTS_LIMIT, TIME_WINDOW));
        return Bucket4j.builder()
                .addLimit(limit)
                .build();
    }


    public boolean allowRequest(String ip) {
        Bucket bucket = resolveBucket(ip);
        return bucket.tryConsume(1);
    }


    public long getRemainingRequests(String ip) {
        return REQUESTS_LIMIT;
    }
}

