package com.shenglei.singleton;

import com.shenglei.singleton.pojo.RoomType;
import com.shenglei.singleton.pojo.Single;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Demo of Enum Singleton (Thread Safe)
        RoomType singleRoom = RoomType.Single;
        System.out.println(singleRoom.getCapacity());
        System.out.println(singleRoom.getPrice());
        RoomType doubleRoom = RoomType.Double;
        System.out.println(doubleRoom.getCapacity());
        System.out.println(doubleRoom.getPrice());
        RoomType singleRoom2 = RoomType.Single;
        System.out.println(singleRoom == singleRoom2);
        // Demo of override equal and hashcode and "=="
        Map<Single, Integer> cache = new HashMap<>();
        Single s1 = new Single(1, 100);
        Single s2 = new Single(1, 100);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        cache.put(s1, 1);
        cache.put(s2, 2);
        System.out.println(cache.size());
        for (Map.Entry<Single, Integer> entry : cache.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        // Demo of override equal and hashcode and "==" of String Class
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode() == str2.hashCode());
    }
}