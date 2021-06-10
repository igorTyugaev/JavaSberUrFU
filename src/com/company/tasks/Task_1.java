package com.company.tasks;

import com.company.utils.TestData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Task_1 {
    private static <T> Collection<T> removeDuplicates1(Collection<T> inList) {
        ArrayList<T> outList = new ArrayList<T>();

        for (T element : inList)
            if (!outList.contains(element))
                outList.add(element);

        return outList;
    }

    private static <T> Collection<T> removeDuplicates2(Collection<T> inList) {
        return new LinkedHashSet<>(inList);
    }

    private static <T> Collection<T> removeDuplicates3(Collection<T> inList) {
        ArrayList<T> outList = (ArrayList<T>) inList.stream()
                .distinct()
                .collect(Collectors.toList());

        return outList;
    }

    public static void testingTask() {
        System.out.println("--------- Задача № 1 ---------");
        System.out.println("Начальная коллекция:");

        Collection<Integer> collection = TestData.getCollection(10);
        System.out.println(collection);

        System.out.println("Итоговая коллекция (способ 1): ");
        System.out.println(removeDuplicates1(collection));

        System.out.println("Итоговая коллекция (способ 2): ");
        System.out.println(removeDuplicates2(collection));

        System.out.println("Итоговая коллекция (способ 3): ");
        System.out.println(removeDuplicates3(collection));

        System.out.println();
    }
}
