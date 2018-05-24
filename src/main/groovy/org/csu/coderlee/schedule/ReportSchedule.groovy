package org.csu.coderlee.schedule

import org.csu.coderlee.handler.Handler
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

import javax.annotation.Resource
import java.text.SimpleDateFormat

/**
 * @author by bixi.lx
 * @created on 2018 05 19 21:55
 */
@Component
class ReportSchedule {

    @Resource
    Handler handler;

    @Scheduled(cron = "0/30 * * * * ?")
    void testSchedule() {
        println("每5s执行一次" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
    }

    @Scheduled(cron = "0/5 * * * * ?")
    void testSchuduleCallback() {
        handler.execute()
    }
}
