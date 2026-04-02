package com.kidz.krch;

public class LinkRequest {
    private String originalUrl;

    public LinkRequest() {}

    public LinkRequest(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }
}

