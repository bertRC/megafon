package ru.itpark.model;

public class TariffJoinIn extends AbstractTariff {
    private int minutes;
    private String minutesDescription;
    private int gigabytes;
    private int smsCount;
    private String additionalFeature;
    private String cashbackFeature;
    private String otherFeature;

    public TariffJoinIn(int id, String title, int price, String payPeriod, boolean isHit, boolean canBeOrderedOnline, int minutes, String minutesDescription, int gigabytes, int smsCount, String additionalFeature, String cashbackFeature, String otherFeature) {
        super(id, title, price, payPeriod, isHit, canBeOrderedOnline);
        this.minutes = minutes;
        this.minutesDescription = minutesDescription;
        this.gigabytes = gigabytes;
        this.smsCount = smsCount;
        this.additionalFeature = additionalFeature;
        this.cashbackFeature = cashbackFeature;
        this.otherFeature = otherFeature;
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

    public String getAdditionalFeature() {
        return additionalFeature;
    }

    public String getCashbackFeature() {
        return cashbackFeature;
    }

    public String getOtherFeature() {
        return otherFeature;
    }

    @Override
    public String toString() {
        String rubleSymbol = " \u20BD ";
        String endOfLine = "\r\n";
        String result = super.getTitle();
        if (super.isHit()) {
            result = result + " (Хит)";
        }
        result = result + endOfLine + minutes + " минут" + endOfLine;
        if (gigabytes > 0) {
            result = result + gigabytes + " ГБ" + endOfLine;
        } else {
            result = result + "Безлимитный интернет" + endOfLine;
        }
        if (smsCount > 0) {
            result = result + smsCount + " SMS" + endOfLine;
        }
        if (additionalFeature != null) {
            result = result + additionalFeature + endOfLine;
        }
        if (cashbackFeature != null) {
            result = result + cashbackFeature + endOfLine;
        }
        if (otherFeature != null) {
            result = result + otherFeature + endOfLine;
        }
        result = result + super.getPrice() + rubleSymbol + super.getPayPeriod() + endOfLine;
        if (super.isCanBeOrderedOnline()) {
            result = result + "*Выбрать*" + endOfLine;
        }
        return result;
    }
}
