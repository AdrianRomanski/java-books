package java_basics.chapter_8.priorityQueue;

import java.time.LocalDate;
import java.util.*;

public class PriorityQueueTest {

    public static void main(String[] args) {

        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9)); // G. Hopper
        pq.add(LocalDate.of(1815, 12, 10)); // A. Lovelace
        pq.add(LocalDate.of(1903, 12, 3)); // J. von Neumann
        pq.add(LocalDate.of(1910, 6, 22)); // K. Zuse

        for (LocalDate date : pq)
            System.out.println(date);
        System.out.println("Deleting elements");
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}

