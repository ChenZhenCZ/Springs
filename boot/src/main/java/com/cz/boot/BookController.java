package com.cz.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookController {

    @Autowired
    private BookBean bookBean;

    @RequestMapping("/book")
    public String book() {
        return "Hello Spring Boot! The BookName is "+ bookBean.getName()+";and Book Author is "+ bookBean.getAuthor()+";and Book price is "+ bookBean.getPrice();
    }
}
