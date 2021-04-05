package com.company.utils;

import java.util.HashMap;
import java.util.Map;

public class Constants {
    //    Расшифровка кодов транспортных средств
    public static final Map<String, String> CODE_CARS = new HashMap<>() {{
        put("100", "легковой авто");
        put("200", "грузовой авто");
        put("300", "пассажирский транспорт");
        put("400", "тяжелая техника(краны)");
    }};

    //    Стоимость литра топлива
    public static final Map<String, Double> COST_PER_LITER = new HashMap<>() {{
        put("100", 46.10d);
        put("200", 48.90d);
        put("300", 47.50d);
        put("400", 48.90d);
    }};

    //    Расход топлива на 100 км
    public static final Map<String, Float> CONSUMPTION = new HashMap<>() {{
        put("100", 12.5f);
        put("200", 12.0f);
        put("300", 11.5f);
        put("400", 20.0f);
    }};
}
