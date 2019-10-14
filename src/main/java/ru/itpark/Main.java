package ru.itpark;

import ru.itpark.model.AbstractTariff;
import ru.itpark.model.TariffJoinIn;

public class Main {
    public static void main(String[] args) {
        AbstractTariff[] tariffs = new AbstractTariff[6];

        String[] additionalFeatures = {"Всегда оставайтесь на связи", "Кэшбэк до 30%"};
        tariffs[0] = new TariffJoinIn(
                1,
                "Включайся! Общайся",
                350,
                "за 30 дней",
                true,
                true,
                600,
                "Звонки на все мобильные номера России",
                0,
                0,
                additionalFeatures);

    }
}
