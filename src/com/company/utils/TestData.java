package com.company.utils;

import java.util.*;

public class TestData {

    public static <T> Collection<T> getCollection(int len) {
        Collection<Integer> collection = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            Random generator = new Random();
            collection.add(generator.nextInt(7));
        }


        return (Collection<T>) collection;
    }

    public static <K, V> Map<V, K> getMap(int len) {
        Map<String, Integer> outMap = new HashMap<>();

        for (int i = 0; i < len; i++) {
            Random generator = new Random();
            outMap.put("key_" + String.valueOf(generator.nextInt(7)), generator.nextInt(7));
        }

        return (Map<V, K>) outMap;
    }
}
