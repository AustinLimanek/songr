package com.cometAlbum.songr.repositories;

import com.cometAlbum.songr.album.Album.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {

    public Album findByTitle(String title);
    public Album findByArtist(String artist);
    public Album findBySongCount(Integer songCount);
    public Album findByLength(Integer length);
    public Album findByImageUrl(String imageUrl);

}
