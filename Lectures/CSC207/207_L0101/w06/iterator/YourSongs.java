package iterator;

import java.util.Iterator;

public class YourSongs implements Iterable<Song> {

	Song[] songs;
	
	public YourSongs() {
		songs = new Song[3];
		
		songs[0] = new Song("Hello", "Adele");
		songs[1] = new Song("Unity", "FatRat");
		songs[2] = new Song("Sound of Silence", "Simon & Garfunkel");
	}

	@Override
	public Iterator<Song> iterator() {
		return new YourSongsIterator(songs);
	}
	
	
}
