package ru.itpark.model;

public class TariffForDevices extends AbstractTariff {
    private String description;
    private String internetDescription;

    public TariffForDevices(int id, String title, int price, String payPeriod, boolean isHit, boolean canBeOrderedOnline, String description, String internetDescription) {
        super(id, title, price, payPeriod, isHit, canBeOrderedOnline);
        this.description = description;
        this.internetDescription = internetDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getInternetDescription() {
        return internetDescription;
    }

    @Override
    public String toString() {
        String rubleSymbol = " \u20BD ";
        String endOfLine = "\r\n";
        String result = super.getTitle();
        if (super.isHit()) {
            result = result + " (Хит)";
        }
        result = result + endOfLine + description + endOfLine + internetDescription + endOfLine + super.getPrice() + rubleSymbol;
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
