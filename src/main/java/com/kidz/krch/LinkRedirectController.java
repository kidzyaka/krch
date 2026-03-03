package com.kidz.krch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class LinkRedirectController {

    private final LinkService linkService;

    public LinkRedirectController(LinkService linkService) {
        this.linkService = linkService;
    }

    @GetMapping("/{shortCode}")
    public ResponseEntity<Void> getOriginalUrl(@PathVariable String shortCode) {
        String originalUrl = linkService.getUrl(shortCode);

        if (originalUrl == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity
                .status(HttpStatus.MOVED_PERMANENTLY)
                .header("Location", originalUrl)
                .build();
    }
}
