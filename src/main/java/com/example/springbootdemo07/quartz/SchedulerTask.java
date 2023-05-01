package com.example.springbootdemo07.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: SchedulerTask
 * Package: com.example.springbootdemo07.controller
 * Description:
 *
 * @author : 康熙
 * @version : v1.0
 */
@Component
public class SchedulerTask {
    @Scheduled(cron="*/10 * * * * ?")
    private void taskCron(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("现在时间Scheduled1： " + dateFormat.format(new Date()));
    }
    @Scheduled(fixedRate = 10000)
    public void taskFixed() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("现在时间Scheduled2： " + dateFormat.format(new Date()));
    }
}