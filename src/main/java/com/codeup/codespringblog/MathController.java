package com.codeup.codespringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/3/and/4")
    @ResponseBody
    public String seven(){
        return "3 + 4 = " + (3 + 4);
    }

    @GetMapping("/subtract/3/from/10")
    @ResponseBody
    public String twoSeven(){
        return "10 - 3 = " + (10 - 3);
    }

    @GetMapping("/multiply/4/and/5")
    @ResponseBody
    public String twenty(){
        return "4 * 5 = " + (4 * 5);
    }

    @GetMapping("/divide/6/by/3")
    @ResponseBody
    public String two(){
        return "6 / 3 = " + (6 / 3);
    }
}
