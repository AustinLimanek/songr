package com.cometAlbum.songr.controllers;

import com.cometAlbum.songr.album.Album.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getHome(){
        return "Hello, World!";
    }*/


    @GetMapping("/hi")
    public String getHi(){
        return "hello";
    }

    @GetMapping("/sayhello/{name}")
    @ResponseBody
    public String sayHello(@PathVariable String name){
        return "Hello " + name;
    }

    //this is located in the templates in a friends directory and a html file called newFriends.html
    @GetMapping("/capitalize/{message}")
    public String modelMe(@PathVariable String message, Model m){
        m.addAttribute("name", message.toUpperCase());
        return "routes/capitalize.html";
    }

    @GetMapping("/")
    public String modelMe(){
        return "routes/splash.html";
    }

    @GetMapping("/albums")
    public String albums(Model m){
        Album paak = new Album("Malibu", "Anderson.Paak", 16, 3660, "https://media.pitchfork.com/photos/5929b2ca5e6ef9596932235b/1:1/w_600/0e1836c9.jpg");
        Album beatles = new Album("Revolver", "Beatles", 15, 2340, "https://www.cleveland.com/resizer/s6SDHxyEfPGSqOcO2SldzIx-oh4=/1280x0/smart/cloudfront-us-east-1.images.arcpublishing.com/advancelocal/NPA24LRWQBDY3NDVM2E5RNYQUE.jpg");
        Album spektor = new Album("Begin To Hope", "Regina Spektor", 12, 2820, "https://media.pitchfork.com/photos/5929aba413d1975652139c3a/1:1/w_600/85b228fc.jpg");
        Album[] albums = {paak, beatles, spektor};
        m.addAttribute("albums", albums);
        return "routes/albums";
    }

}
