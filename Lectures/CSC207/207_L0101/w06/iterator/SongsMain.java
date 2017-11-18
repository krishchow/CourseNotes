package iterator;

import java.util.Iterator;

public class SongsMain {

	public static void main(String[] args) {
		YourSongs songs1 = new YourSongs();
		MySongs songs2 = new MySongs();
		
		for (Song s: songs1) {
			System.out.println(s);
		}
		
		for (Song s: songs2) {
			System.out.println(s);
		}
		
		// the above is the same as:
		Iterator<Song> it = songs1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
