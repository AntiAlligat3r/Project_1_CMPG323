package za.ac.nwu.AccountSystem.web.sb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"za.ac.nwu.AccountSystem.web.sb.controller",
                               "za.ac.nwu.AccountSystem.web.sb.exception"})

public class WebConfig {
}
