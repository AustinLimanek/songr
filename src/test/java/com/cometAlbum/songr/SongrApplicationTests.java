package com.cometAlbum.songr;

import com.cometAlbum.songr.album.Album.Album;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void getterCheck() {
		Album paak = new Album("Malibu", "Anderson.Paak", 16, 3660, "https://media.pitchfork.com/photos/5929b2ca5e6ef9596932235b/1:1/w_600/0e1836c9.jpg");
		assertEquals("Malibu", paak.getTitle());
	}

	@Test
	void setter() {
		Album paak = new Album("Mali", "Anderson.Paak", 16, 3660, "https://media.pitchfork.com/photos/5929b2ca5e6ef9596932235b/1:1/w_600/0e1836c9.jpg");
		paak.setTitle("Malibu");
		assertEquals("Malibu", paak.getTitle());
	}

}
