package com.anhvoleduy.myclock.service.impl;

import com.anhvoleduy.myclock.service.IDateTimeService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class DateTimeService implements IDateTimeService{
    @Override
    public String getCurrentTime() {
        ZoneId zoneId = ZoneId.of("Asia/Ho_Chi_Minh");
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now(zoneId);

        return format.format(localDateTime);
    }
}