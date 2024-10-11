package com.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApiTest {

    @Test
    void generateKey() {
        String expected = "123-Malco-1";
        Api api = new Api("123", "Malco", 1);
        String key = api.generateKey();

        Assertions.assertEquals(expected, key);

    }
}