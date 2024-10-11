package com.demo;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class Api {

    private final String id;
    private final String name;
    private final int version;

    private static final Logger logger = LoggerFactory.getLogger(Api.class.getSimpleName());

    public String generateKey() {
        String key = id + "-" + name + "-" + version;
        logger.info(key);
        return key;
    }
}
