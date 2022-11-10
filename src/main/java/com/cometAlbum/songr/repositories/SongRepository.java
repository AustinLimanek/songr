package com.cometAlbum.songr.repositories;

import com.cometAlbum.songr.album.Album.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {

    public Song findByTitle(String title);
    public Song findByTrackNumber(Integer trackNumber);
    public Song findByLength(Integer length);

}
