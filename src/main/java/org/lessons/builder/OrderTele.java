package org.lessons.builder;

/**
 * Problem with this class is that its not immutable
 * Telescoping constructors are ambiguous in this case
 *
 * <p>
 *
 * @author axteel on 05.04.2021 : 17:02
 * @version 1.0
 */
public class OrderTele {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public OrderTele() { }

    public OrderTele(String bread) {
        this.bread = bread;
    }

    public OrderTele(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public OrderTele(String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public OrderTele(String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    @Override
    public String toString() {
        return "OrderTele {" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
