package com.kidz.krch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/links")
public class LinkController {

    private final LinkService linkService;

    public LinkController(LinkService linkService) {
        this.linkService = linkService;
    }

    @PostMapping
    public ResponseEntity<CreateLinkResponse> createShortLink(@RequestBody LinkRequest request) {
        String shortCode = linkService.addUrl(request.getOriginalUrl());
        String shortUrl = "http://localhost:8080/" + shortCode;
        CreateLinkResponse response = new CreateLinkResponse(
            shortCode,
            request.getOriginalUrl(),
            shortUrl
        );
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{shortCode}")
    public ResponseEntity<GetLinkResponse> getOriginalUrl(@PathVariable String shortCode) {
        String originalUrl = linkService.getUrl(shortCode);
        if (originalUrl == null) {
            return ResponseEntity.notFound().build();
        }
        GetLinkResponse response = new GetLinkResponse(shortCode, originalUrl);
        return ResponseEntity.ok(response);
    }
}

