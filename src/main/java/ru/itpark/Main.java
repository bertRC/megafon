package ru.itpark;

import ru.itpark.model.AbstractTariff;
import ru.itpark.model.TariffForDevices;
import ru.itpark.model.TariffJoinIn;

public class Main {
    public static void main(String[] args) {
        AbstractTariff[] tariffs = new AbstractTariff[6];

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
                "Всегда оставайтесь на связи",
                "Кэшбэк до 30%",
                null);

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
                "Безлимитный интернет на популярные сервисы",
                "Кэшбэк до 30%",
                null);

        tariffs[2] = new TariffForDevices(
                3,
                "Твой безлимит на 12 месяцев",
                5_100,
                "за год",
                false,
                true,
                "Трафик без ограничений для использования дома и в поездках по России",
                "Безлимитный интернет");

        tariffs[3] = new TariffForDevices(4,
                "МегаФон — Онлайн",
                0,
                "в месяц",
                false,
                true,
                "Базовый тариф для подключения интернет-опций и использования на устройствах",
                "Оплата трафика по факту использования");

        for (AbstractTariff tariff : tariffs) {
            System.out.println(tariff);
        }
    }
}
