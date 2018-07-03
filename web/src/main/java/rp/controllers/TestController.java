package rp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rp.dto.TestDTO;

@RestController
public class TestController {

    @RequestMapping("/test")
    public TestDTO test() {
        return new TestDTO("1", "name1");
    }
}
