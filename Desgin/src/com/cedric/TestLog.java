package com.cedric;

import org.apache.log4j.Logger;

public class TestLog
{
    public static void main(String[] args)
    {
        Logger log = Logger.getLogger(User.class);
        log.debug("hello debug");
        log.info("hello info");
        log.warn("hello warn");
        log.error("hello error");
        log.fatal("hello fatal");
    }
}
