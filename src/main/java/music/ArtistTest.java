package music;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArtistTest {
    public static void main(String[] args) {
//        ArrayList<Artist> a = new ArrayList();
//        a.add(new Artist("GZA"));
//        a.add(new Artist("MF DOOM"));
//        a.add(new Artist("Mac Miller"));

//        for (Artist rza:a) {
//            System.out.println(rza.name);
//        }

        // link list, add 3 things, use an iterator

        LinkedList<Artist> artistLlist = new LinkedList<Artist>();
        artistLlist.add(0, new Artist("Raekwon"));
        artistLlist.add(1, new Artist("ODB"));
        artistLlist.add(2, new Artist("Ghostface Killah"));

        ListIterator<Artist> listIterator = artistLlist.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
