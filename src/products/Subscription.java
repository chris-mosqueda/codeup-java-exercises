package products;

public class Subscription extends Product{
    private int monthsSubd;
    private int yearsSubd;

    public Subscription(String pName, String pCat, int pSku, int monthsSubd, int yearsSubd) {
        super(pName, pCat, pSku);
        this.monthsSubd = monthsSubd;
        this.yearsSubd = yearsSubd;
    }

    public int getMonthsSubd() {
        return monthsSubd;
    }

    public int getYearsSubd() {
        return yearsSubd;
    }

    public int totMonthsSubd(){
        return (this.yearsSubd * 12) + this.monthsSubd;
    }

    public String lookAtProd(){
        return "Subscription is for " + totMonthsSubd() + " months";
    }
}
