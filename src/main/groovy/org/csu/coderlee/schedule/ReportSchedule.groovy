package org.csu.coderlee.schedule

import org.csu.coderlee.handler.Handler
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

import javax.annotation.Resource

/**
 * @author by bixi.lx
 * @created on 2018 05 19 21:55
 */
//@Component
class ReportSchedule implements ISchedule{

    @Resource
    Handler handler

    @Scheduled(cron = "0/1 * * * * ?")
    void testSchuduleCallback() {
        handler.execute(this)
    }

    @Override
    void callBack() {
        println(System.getProperty("dev.open"))
        System.out.println("call call call")
    }
}
