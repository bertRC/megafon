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
}
