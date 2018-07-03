package rp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import rp.converters.StringToTestDTOConverter;

@SpringBootApplication
public class RemotePlay {

    public static void main(String[] args) {
        SpringApplication.run(RemotePlay.class, args);
    }
}
