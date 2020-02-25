package com.study.study_space.jichu.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {

    private final static Logger logger = LoggerFactory.getLogger(Logback.class);

    public static void main(String[] args) {
            logger.info("logback 成功了");
            logger.error("logback 成功了");
            logger.debug("logback 成功了");
    }
}

