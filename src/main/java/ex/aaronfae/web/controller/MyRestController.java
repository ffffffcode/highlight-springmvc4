package ex.aaronfae.web.controller;

import ex.aaronfae.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    private DemoService demoService;

    @Autowired
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    @RequestMapping(value = "/testRest", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String testRest() {
        return demoService.saySomething();
    }
}
