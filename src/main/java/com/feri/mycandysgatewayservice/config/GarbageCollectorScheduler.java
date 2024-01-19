package com.feri.mycandysgatewayservice.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class GarbageCollectorScheduler {

    @Scheduled(cron = "0 0 * * * *")
    public void runGarbageCollector() {
        System.out.println("Running garbage collector...");
        System.gc();
    }
}
