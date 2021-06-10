package com.company.tasks;

import com.company.utils.TestData;

import java.util.*;

public class Task_2 {
    private static <K, V> Map<V, Collection<K>> swapMap(Map<K, V> inMap) {
        Map<V, Collection<K>> outMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inMap.entrySet()) {
            V entryValue = entry.getValue();
            K entryKey = entry.getKey();

            Set<V> vSet = (Set<V>) outMap.getOrDefault(entryValue, new HashSet<>());
            vSet.add((V) entryKey);
            outMap.put(entryValue, (Collection<K>) vSet);
        }

        return outMap;
    }

    public static void testingTask() {
        System.out.println("--------- Задача № 2 ---------");
        System.out.println("Начальная Map-а:");

        Map<String, Integer> inMap = TestData.getMap(10);
        System.out.println(inMap);

        System.out.println("Итоговая Map-a:");
        System.out.println(swapMap(inMap));

        System.out.println();
    }
}
