package com.anhvoleduy.myclock.servicetest;

import com.anhvoleduy.myclock.service.IDateTimeService;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class DateTimeServiceTest {
    /*@Autowired
    private IDateTimeService iDateTimeService;*/

    @Test
    public void should_return_current_date_time_in_viet_nam() {
        /*Instant now = Instant.now();
        ZoneId zoneId = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime expectedZonedDateTime = ZonedDateTime.ofInstant(now, zoneId);

        Assert.assertThat(iDateTimeService.getCurrentDateTime().getHour(), CoreMatchers.is(expectedZonedDateTime.getHour()));
        Assert.assertThat(iDateTimeService.getCurrentDateTime().getMinute(), CoreMatchers.is(expectedZonedDateTime.getMinute()));*/
    }
}