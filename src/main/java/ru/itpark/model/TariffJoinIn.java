package ru.itpark.model;

public class TariffJoinIn extends AbstractTariff {
    private int minutes;
    private String minutesDescription;
    private int gigabytes;
    private int smsCount;
    private String[] additionalFeatures;

    public TariffJoinIn(int id, String title, int price, String payPeriod, boolean isHit, boolean canBeOrderedOnline, int minutes, String minutesDescription, int gigabytes, int smsCount, String[] additionalFeatures) {
        super(id, title, price, payPeriod, isHit, canBeOrderedOnline);
        this.minutes = minutes;
        this.minutesDescription = minutesDescription;
        this.gigabytes = gigabytes;
        this.smsCount = smsCount;
        this.additionalFeatures = additionalFeatures;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getMinutesDescription() {
        return minutesDescription;
    }

    public int getGigabytes() {
        return gigabytes;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public String[] getAdditionalFeatures() {
        return additionalFeatures;
    }
}
