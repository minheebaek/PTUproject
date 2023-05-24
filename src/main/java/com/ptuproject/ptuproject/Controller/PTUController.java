package com.ptuproject.ptuproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PTUController {

//    @GetMapping("ptuinfo")
//    public String ptuinfo(Model model){
//        model.addAttribute("date","1,2");
//        return "greeting";
//    }

    @GetMapping("ptuinfo")
    public String ptuinfo(){

        return "bustime";
    }

}
