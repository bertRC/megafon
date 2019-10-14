package ru.itpark.model;

public abstract class AbstractTariff {
    private int id;
    private String title;
    private int price;
    private String payPeriod;
    private boolean isHit;
    private boolean canBeOrderedOnline;

    public AbstractTariff(int id, String title, int price, String payPeriod, boolean isHit, boolean canBeOrderedOnline) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.payPeriod = payPeriod;
        this.isHit = isHit;
        this.canBeOrderedOnline = canBeOrderedOnline;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public boolean isHit() {
        return isHit;
    }

    public boolean isCanBeOrderedOnline() {
        return canBeOrderedOnline;
    }
}
