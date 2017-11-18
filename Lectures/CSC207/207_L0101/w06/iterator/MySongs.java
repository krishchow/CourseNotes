package iterator;

import java.util.HashMap;
import java.util.Iterator;

public class MySongs implements Iterable<Song> {

	 HashMap<Integer, Song> mySongs;
	 
	 public MySongs() {
		 mySongs = new HashMap<Integer, Song>();
		 
		 mySongs.put(0, new Song("Kingdom Hearts Theme Song", "Utada Hikaru"));
		 mySongs.put(1, new Song("Sephiroth's Theme Song", "Nobuo Uematsu"));
		 mySongs.put(2, new Song("Let it go", "Idina Menzel"));
	 }

	@Override
	public Iterator<Song> iterator() {
		return new MySongsIterator(mySongs);
	}
}
