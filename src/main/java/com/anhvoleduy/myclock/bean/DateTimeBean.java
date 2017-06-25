package com.anhvoleduy.myclock.bean;

import com.anhvoleduy.myclock.service.IDateTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ViewScoped;

@Component("dateTimeBean")
@ViewScoped
public class DateTimeBean {
    @Autowired
    private IDateTimeService iDateTimeService;

    public String getCurrentTime() {
        return iDateTimeService.getCurrentTime().toString();
    }
}