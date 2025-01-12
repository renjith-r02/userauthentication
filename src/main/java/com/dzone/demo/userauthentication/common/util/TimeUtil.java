package com.dzone.demo.userauthentication.common.util;

import org.springframework.stereotype.Component;

@Component
public class TimeUtil {

    public static long getCurrentEpochTime() {
        return System.currentTimeMillis();
    }
}