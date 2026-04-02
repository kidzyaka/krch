package com.kidz.krch;

public class CreateLinkResponse {
    private String shortCode;
    private String shortUrl;

    public CreateLinkResponse(String shortCode, String originalUrl, String shortUrl) {
        this.shortCode = shortCode;
        this.shortUrl = shortUrl;
    }

    public String getShortCode() {
        return shortCode;
    }


    public String getShortUrl() {
        return shortUrl;
    }
}

