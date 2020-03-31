package com.hendisantika.springbootthymeleaflayoutdialect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-thymeleaf-layout-dialect
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/03/20
 * Time: 06.46
 */
@Controller
public class HelloController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("waktu", LocalDateTime.now());
        return "index";
    }

    @GetMapping(value = "/home")
    public ModelAndView test(HttpServletResponse response) {
        return new ModelAndView("home");
    }

    @GetMapping(value = "/demoPage1")
    public ModelAndView demoPage1(HttpServletResponse response) {
        return new ModelAndView("demoPage1");
    }

    @GetMapping(value = "/demoPage2")
    public ModelAndView demoPage2(HttpServletResponse response) {
        return new ModelAndView("demoPage2");
    }
}
