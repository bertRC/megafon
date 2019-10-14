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
}
