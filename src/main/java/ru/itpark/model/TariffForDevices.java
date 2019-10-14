package ru.itpark.model;

public class TariffForDevices extends AbstractTariff {
    private String description;
    private int megabytes;
    private int megabytesCost;

    public TariffForDevices(int id, String title, int price, String payPeriod, boolean isHit, boolean canBeOrderedOnline, String description, int megabytes, int megabytesCost) {
        super(id, title, price, payPeriod, isHit, canBeOrderedOnline);
        this.description = description;
        this.megabytes = megabytes;
        this.megabytesCost = megabytesCost;
    }

    public String getDescription() {
        return description;
    }

    public int getMegabytes() {
        return megabytes;
    }

    public int getMegabytesCost() {
        return megabytesCost;
    }

    @Override
    public String toString() {
        String rubleSymbol = " \u20BD ";
        String endOfLine = "\r\n";
        String result = super.getTitle();
        if (super.isHit()) {
            result = result + " (Хит)";
        }
        result = result + endOfLine + description + endOfLine;
        if ((megabytes == 0) || (megabytesCost == 0)) {
            result = result + "Безлимитный интернет" + endOfLine;
        } else {
            result = result + "Оплата трафика по факту использования" + endOfLine;
        }
        result = result + super.getPrice() + rubleSymbol;
        if (super.getPrice() == 0) {
            result = result + super.getPayPeriod();
        }
        result = result + endOfLine;
        if (super.isCanBeOrderedOnline()) {
            result = result + "*Выбрать*" + endOfLine;
        }
        return result;
    }
}
