package org.repository;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Component;

@Component
public class TimeRep {
    public String getCurrentTime() {
        LocalTime localTime = new LocalTime();
        int hours = localTime.getHourOfDay();
        int minutes = localTime.getMinuteOfHour();
        int seconds = localTime.getSecondOfMinute();
        String result = hours + "h|" + minutes + "m|" + seconds +"s";
        return result;
    }
}
