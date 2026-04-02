package com.kidz.krch;

public class GetLinkResponse {
    private String originalUrl;
    private String shortCode;

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

