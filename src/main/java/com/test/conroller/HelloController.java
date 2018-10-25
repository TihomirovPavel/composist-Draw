package com.test.conroller;

import com.test.model.AnsweModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    String introText = "You have some rest options";

    @Autowired
    private AnsweModel answeModel;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot! </br>" + introText;
    }

    @RequestMapping("/create/circle/{x}/{y}/{radius}")
    public String createCircle(@PathVariable int x,@PathVariable int y,@PathVariable int radius) {
        return answeModel.createCircle(x,y,radius);
    }

    @RequestMapping("/create/rectangle/{x}/{y}/{width}/{height}")
    public String createRectangle(@PathVariable int x,@PathVariable int y,@PathVariable int width,@PathVariable int height) {
        return answeModel.createRectangle(x,y,width,height);
    }

    @RequestMapping("/create/composite/{x}/{y}/{width}/{height}")
    public String createComposite(@PathVariable int x,@PathVariable int y,@PathVariable int width,@PathVariable int height) {
        return answeModel.createComposite(x,y,width,height);
    }

}