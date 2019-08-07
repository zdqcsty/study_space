package com.study.study_space.jichu.log;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {

    static{
        /**
         * 手动加载log配置文件的方式
         */
        //properties配置方式
//        PropertyConfigurator.configure(Logback.class.getClassLoader().getResourceAsStream("config/log4j.properties"));
        //xml配置方式
//        new DOMConfigurator().doConfigure(Logback.class.getClassLoader().getResourceAsStream("logback.xml"), LogManager.getLoggerRepository());


//        DOMConfigurator.configure("config/logback.xml");
    }

    private final static Logger logger = LoggerFactory.getLogger(Logback.class);

    public static void main(String[] args) {

            logger.info("logback 成功了");
            logger.error("logback 成功了");
            logger.debug("logback 成功了");

    }
}

