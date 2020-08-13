package java_basics.chapter_8.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {

        List<String> a = new LinkedList<>();
        a.add("Walter");
        a.add("Jessie");
        a.add("Adrian");

        List<String> b = new LinkedList<>();
        b.add("Philip");
        b.add("Carl");
        b.add("Thomas");
        b.add("Anakin");


        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext())
        {
            if (aIter.hasNext()) aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.iterator();
        while(bIter.hasNext()) {
            bIter.next();
            if(bIter.hasNext()) {
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);

    }
}
