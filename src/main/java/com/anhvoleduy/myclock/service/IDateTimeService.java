package com.anhvoleduy.myclock.service;

import org.springframework.stereotype.Repository;

import java.time.ZonedDateTime;

public interface IDateTimeService {
    String getCurrentTime();
}