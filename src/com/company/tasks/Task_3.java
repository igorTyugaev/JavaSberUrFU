package com.company.tasks;

import com.company.utils.TestData;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Task_3 {

    public static String getWinnerName(String text) {
        Map<Integer, String> items = new TreeMap<>(Collections.reverseOrder());
        String[] strArray = text.replaceAll("[^\\w\\s,]", "").trim().split(",");

        for (String line : strArray) {
            line = line.trim();
            String[] item = line.split("[\\s]+");
            items.putIfAbsent(Integer.parseInt(item[1]), item[0]);
        }

        String winnerName = items.get(items.keySet().toArray()[0]);

        return winnerName;
    }

    public static void testingTask() {
        System.out.println("--------- Задача № 3 ---------");
        System.out.println("Входной набор данных:");

        String str = "\"Ivan 5\", \"Petr 3\", \"Alex 10\", \"Petr 8\", \"Ivan 6\", \"Alex 5\", \"Ivan 1\", \"Petr 5\", \"Alex 1\"";
        System.out.println(str);

        System.out.println("Имя победителя: ");
        System.out.println(getWinnerName(str));

        System.out.println();
    }
}
