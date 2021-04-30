package com.study.study_space.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackUtils {

    //这里使用static final，说明是个静态常量，所以这块命名应该全部大写
    private static final Logger LOG = LoggerFactory.getLogger(LogbackUtils.class);

    public static void main(String[] args) {
        LOG.info("logback 成功了");
        LOG.error("logback 成功了");
        LOG.debug("logback 成功了");
        try {
            getException();
        } catch (Exception e) {
            LOG.error("err",e);
        }
    }

    public static void getException() throws Exception {
        throw new Exception("ceshi");
    }
}

