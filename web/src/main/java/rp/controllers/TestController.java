package rp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rp.dto.TestDTO;

@RestController
public class TestController {
    @Autowired
    ConversionService conversionService;

    @RequestMapping("/test")
    public TestDTO test() {
        return conversionService.convert("1", TestDTO.class);
    }
}
