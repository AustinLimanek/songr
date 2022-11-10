package com.cometAlbum.songr.controllers;

import com.cometAlbum.songr.album.Album.Album;
import com.cometAlbum.songr.album.Album.Song;
import com.cometAlbum.songr.repositories.AlbumRepository;
import com.cometAlbum.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/songs")
    public String getSongs(Model m){
        List<Song> songs = songRepository.findAll();
        m.addAttribute("songs", songs);
        return "routes/songs";
    }

    @PostMapping("/yellow")
    public RedirectView addSong(String songName, Integer trackNumber, Integer length, String albumName){
        Album album = albumRepository.findByTitle(albumName);
        Song newSong = new Song(songName, trackNumber, length, album);
        songRepository.save(newSong);
        return new RedirectView("/album/"+ albumName);
    }

    @PostMapping("/redirect")
    public RedirectView specificAlbum(String albumName){
        return new RedirectView("/album/"+ albumName);
    }

    @PostMapping("/home")
    public RedirectView home(){
        return new RedirectView("/");
    }

}
