package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@ResponseBody
//@Controller
@RestController
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World!";
    }

    @RequestMapping(value = "/characters", method = RequestMethod.GET)
    public String getCharacters() {
        //simulate retrieving all characters in the DB.
        return "Peach Daisy Yoshi Mario";
    }

    @GetMapping("/characters/{id}")
    public String getCharacter(@PathVariable("id") String input) {
        //Pretend to a call a Service
        return characterServiceGetCharacter(input);
    }

    private String characterServiceGetCharacter(String input) {

//        String[] characters = {"Peach", "Daisy", "Yoshi", "Mario"};
        List<String> characters = new ArrayList<>();
        characters.add("Peach");
        characters.add("Daisy");
        characters.add("Yoshi");
        characters.add("Mario");

        int num;

        //Using Character.isDigit()
//        boolean isNumber = true;
//        for(char c : input.toCharArray()) {
//            if(!Character.isDigit(c)) {
//                isNumber = false;
//                break;
//            }
//        }
//
//        if(isNumber) {
//            num = Integer.parseInt(input);
//        } else {
//            num = -1;
//        }

        //using matches() to test the string against a RegEx
        if(input.matches("[0-9]+")) {
            num = Integer.parseInt(input);
        } else {
            num = -1;
        }

        if(num >= 1 && num <= 4) {
            return characters.get(num - 1);
        } else {
            return "The character you are looking for is in another app";
        }

    }

}
