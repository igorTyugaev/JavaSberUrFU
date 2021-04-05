package com.company;

import com.company.model.Car;
import com.company.model.GSM;
import com.company.utils.Parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    private static final String testString = "{\"C100_1-100\", \"C200_1-120-1200\", \"C300_1-120-30\", \"C400_1-80-20\", \"C100_2-50\", \"C200_2-40-1000\", \"C300_2-200-45\", \"C400_2-10-20\", \"C100_3-10\", \"C200_3-170-1100\", \"C300_3-150-29\", \"C400_3-100-28\", \"C100_1-300\", \"C200_1-100-750\", \"C300_1-32-15\"}";

    public static void main(String[] args) throws IOException {
        Parser parser = new Parser(testString);
//        Reader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Enter data: ");
//        String inputString = ((BufferedReader) reader).readLine();
//        Parser parser = new Parser(inputString);

        ArrayList<Car> cars = parser.getCars();
        GSM gsm = new GSM(cars);

        System.out.println("Общая стоимость расходов на ГСМ: " + gsm.getTotalCoast());
        System.out.println("Расходы на 100-ый класс: " + gsm.getTotalCoastByType("100"));
        System.out.println("Расходы на 200-ый класс: " + gsm.getTotalCoastByType("200"));
        System.out.println("Расходы на 300-ый класс: " + gsm.getTotalCoastByType("300"));
        System.out.println("Расходы на 400-ый класс: " + gsm.getTotalCoastByType("400"));

        System.out.println("Тип авто имеющий наибольшую стоимость расходов: " + gsm.getTypeCarByMaxTotalCoast());
        System.out.println("Тип авто имеющий наименьшую стоимость расходов: " + gsm.getTypeCarByMinTotalCoast());
        gsm.printAboutCarWithSort();
    }
}
