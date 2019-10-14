package ru.itpark;

import ru.itpark.model.AbstractTariff;
import ru.itpark.model.TariffJoinIn;

public class Main {
    public static void main(String[] args) {
        AbstractTariff[] tariffs = new AbstractTariff[6];

        String[] additionalFeatures1 = {"Всегда оставайтесь на связи", "Кэшбэк до 30%"};
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
                additionalFeatures1);

        String[] additionalFeatures2 = {"Безлимитный интернет на популярные сервисы", "Кэшбэк до 30%"};
        tariffs[1] = new TariffJoinIn(
                2,
                "Включайся! Развлекайся",
                300,
                "за 30 дней",
                false,
                true,
                100,
                "Звонки на местные мобильные номера",
                10,
                0,
                additionalFeatures2);

        for (AbstractTariff tariff : tariffs) {
            System.out.println(tariff);
        }
    }
}
