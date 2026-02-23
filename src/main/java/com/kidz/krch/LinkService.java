package com.kidz.krch;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LinkService {

    private final LinkRepository repo;

    public LinkService(LinkRepository repo) {
        this.repo = repo;
    }

    public String getUrl(String originalUrl) {
//        return repo.findByShortCode(shortCode)
//                .map(ShortUrl::getOriginalUrl)
//                .orElse(null);

        return "https://www.google.com";
    }

    public int addUrl(String originalUrl) {
        return 1;
    }

    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
    private static final Random RANDOM = new Random();

    public static String generateShortCode (){
        StringBuilder sb = new StringBuilder(6);
        for (int i = 0; i < 6; i++) {
            sb.append(CHARS.charAt(RANDOM.nextInt(CHARS.length())));
        }
        return sb.toString();



    }
