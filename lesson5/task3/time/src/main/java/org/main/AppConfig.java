package org.main;

import org.repository.TimeRep;
import org.service.TimePrinterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.service")
public class AppConfig {
    @Bean("rep")
    public TimeRep getTimeRep() {
        return new TimeRep();
    }
}
