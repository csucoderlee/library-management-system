package org.csu.coderlee.schedule

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

import java.text.SimpleDateFormat

/**
 * @author by bixi.lx
 * @created on 2018 05 19 21:55
 */
@Component
class ReportSchedule {

    @Scheduled(cron = "0/5 * * * * ?")
    void testSchedule() {
        println("每5s执行一次" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
    }
}
