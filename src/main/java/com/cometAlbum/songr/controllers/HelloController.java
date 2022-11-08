package com.cometAlbum.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getHome(){
        return "Hello, World!";
    }


    @GetMapping("/hi")
    public String getHi(){
        return "hello";
    }

    //@GetMapping("/sayhello/{name}")
    //@ResponseBody
    //public String sayHello(@PathVariable String name){
    //    return "Hello" + name;
    //}

}
