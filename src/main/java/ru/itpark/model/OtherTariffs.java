package ru.itpark.model;

public class OtherTariffs extends AbstractTariff {
    private String description;
    private String internetDescription;
    private String callDescription;

    public OtherTariffs(int id, String title, int price, String payPeriod, boolean isHit, boolean canBeOrderedOnline, String description, String internetDescription, String callDescription) {
        super(id, title, price, payPeriod, isHit, canBeOrderedOnline);
        this.description = description;
        this.internetDescription = internetDescription;
        this.callDescription = callDescription;
    }

    public String getDescription() {
        return description;
    }

    public String getInternetDescription() {
        return internetDescription;
    }

    public String getCallDescription() {
        return callDescription;
    }

    @Override
    public String toString() {
        String rubleSymbol = " \u20BD ";
        String endOfLine = "\r\n";
        String result = super.getTitle();
        if (super.isHit()) {
            result = result + " (Хит)";
        }
        result = result + endOfLine + description + endOfLine + internetDescription + endOfLine;
        if (callDescription != null) {
            result = result + callDescription + endOfLine;
        }
        result = result + super.getPrice() + rubleSymbol;
        if (super.getPayPeriod() != null) {
            result = result + super.getPayPeriod();
        }
        result = result + endOfLine;
        if (super.isCanBeOrderedOnline()) {
            result = result + "*Выбрать*" + endOfLine;
        }
        return result;
    }
}
