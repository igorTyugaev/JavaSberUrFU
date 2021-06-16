package com.company.tasks;

import java.util.HashMap;

public class Task_3 {

    public static String getWinnerName(String text) {
        HashMap<String, Integer> standings = new HashMap<>();
        String[] strArray = text.replaceAll("[^\\w\\s,]", "").trim().split(",");
        String nameWinner = "The winner is determined!";
        int scoreWinner = -1;

        for (String playerRaw : strArray) {
            String[] player = playerRaw.trim().split("[\\s]+");

            String namePlayer = player[0];
            int scorePlayer = Integer.parseInt(player[1]);

            int newScorePlayer = standings.getOrDefault(namePlayer, 0) + scorePlayer;

            if (newScorePlayer > scoreWinner) {
                scoreWinner = newScorePlayer;
                nameWinner = namePlayer;
            }

            standings.put(namePlayer, newScorePlayer);
        }

        String result = "Победил " + nameWinner + " со счетом " + scoreWinner + " очков.";
        return result;
    }

    public static void testingTask() {
        System.out.println("--------- Задача № 3 ---------");
        System.out.println("Входной набор данных:");

        String str = "\"Ivan 5\", \"Petr 3\", \"Alex 10\", \"Petr 8\", \"Ivan 6\", \"Alex 5\", \"Ivan 1\", \"Petr 5\", \"Alex 1\"";
        System.out.println(str);

        System.out.println("Итоги турнирной таблицы: ");
        System.out.println(getWinnerName(str));

        System.out.println();
    }
}
