package com.kidz.krch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KrchApplicationTests {

    @Autowired
    private KrchApplication krchApplication;

    @Autowired
    private LinkRepository repo;

//    @Test
//    void testAddUrl() {
//        repo.deleteAll();
//
//        String originalUrl = "https://example.com/some/long/url";
//
//        String a = krchApplication.addUrl(originalUrl);
//
//        System.out.println(krchApplication.getUrl(a));
//    }
}