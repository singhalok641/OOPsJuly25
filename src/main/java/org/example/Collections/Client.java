package org.example.Collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
    public static void main(String[] args) {
        /*
        Interfaces: Collection, List, Set, Queue
        Concrete Classes: ArrayList, LinkedList, HashSet, PriorityQueue
         */

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Generics");
        System.out.println(list.get(0));

        ArrayList<String> arrayList = new ArrayList<>();

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.addFirst(0);

        /*
        Vector is synchronized(thread-safe), but now often replaced with concurrent collection classes
        Prefer ArrayList unless you need thread-safety
         */

        Queue<Integer> queue = new LinkedList<>();

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        System.out.println(pq.poll()); // 10

        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Hello"); // Will have no affect
        set.add("Hi");
        set.add("Bye");

        System.out.println("======== HashSet ===========");
        for (String ele: set) {
            System.out.println(ele);
        }
        System.out.println(set.size()); // 1

        // LinkedHashSet maintains the insertion order
        Set<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println("======== Linked Hash Set =======");
        for (int ele: hashSet) {
            System.out.println(ele);
        }

        // TreeSet: sorted order

        Map<String, Integer> map = new HashMap<>();
        map.put("Gautam", 30);
        System.out.println(map.get("Gautam"));

        // HashMap: maintains no order
        // LinkedHashMap: insertion order is maintained
        // TreeMap: sorted by keys

//        ConcurrentHashMap



    }
}
