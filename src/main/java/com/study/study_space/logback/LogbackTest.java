package com.study.study_space.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    public static void main(String[] args) {

        //logback  通过这种方式来定义logger  getLogger的参数可以为 current class name or the class itself
        Logger logger = LoggerFactory.getLogger(LogbackTest.class);
        logger.debug("Hello world.");

        //可以使用这种方式来诊断logback相关的问题
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);

    }
}
