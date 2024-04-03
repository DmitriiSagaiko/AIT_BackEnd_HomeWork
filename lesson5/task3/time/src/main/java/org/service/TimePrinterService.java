package org.service;

import org.repository.TimeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TimePrinterService {
    TimeRep rep;

    @Autowired
    public TimePrinterService(TimeRep rep) {
        this.rep = rep;
    }

    public void showCurrentTime() {
        System.out.println(rep.getCurrentTime());
    }
}
