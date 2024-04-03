package org.main;

import org.service.TimePrinterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TimePrinterService service = (TimePrinterService) context.getBean(TimePrinterService.class);
        service.showCurrentTime();
    }
}
