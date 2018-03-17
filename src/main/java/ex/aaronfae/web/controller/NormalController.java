package ex.aaronfae.web.controller;

import ex.aaronfae.web.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NormalController {

    private DemoService demoService;

    @Autowired
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    @RequestMapping("/normal")
    public String testPage(Model model) {
        model.addAttribute("msg", demoService.saySomething());
        return "page";
    }
}
