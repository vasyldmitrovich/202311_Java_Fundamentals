package com.softserve.edu02.hw.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Mike");
        hashMap.put(3, "Bot");
        hashMap.put(5, "Pete");
        hashMap.put(7, "Masch");
        hashMap.put(8, "Kok");
        hashMap.put(null, "Dick");
        hashMap.put(9, null);
        hashMap.put(2, null);
        for(Map.Entry m : hashMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
