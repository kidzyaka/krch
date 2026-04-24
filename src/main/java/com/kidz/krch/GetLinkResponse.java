package com.kidz.krch;

public class GetLinkResponse {
    private final String originalUrl;
    private final String shortCode;

    public GetLinkResponse(String shortCode, String originalUrl) {
        this.shortCode = shortCode;
        this.originalUrl = originalUrl;

    }

    public String getShortCode() {
        return shortCode;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }
}

