package com.ptuproject.ptuproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("ptuhaksik")
    public String ptuhaksik(Model model){
        model.addAttribute("date","1,2");
        return "greeting";
    }

    @GetMapping("ptubus")
    public String ptubus(){

        return "bustime";
    }

}
