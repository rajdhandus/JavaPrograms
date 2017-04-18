package com.raj;

/**
 * Created by rajkumarpurushothaman on 4/14/17.
 */
public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadType;

    private String additionName1;
    private double additionPrice1;

    private String additionName2;
    private double additionPrice2;

    private String additionName3;
    private double additionPrice3;

    private String additionName4;
    private double additionPrice4;

    public Hamburger(String name, String meat, double price, String breadType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadType = breadType;
    }

    public void addAdditions1 (String name, double price) {
        this.additionName1 = name;
        this.additionPrice1 = price;
    }

    public void addAdditions2 (String name, double price) {
        this.additionName2 = name;
        this.additionPrice2 = price;
    }

    public void addAdditions3 (String name, double price) {
        this.additionName3 = name;
        this.additionPrice3 = price;
    }

    public void addAdditions4 (String name, double price) {
        this.additionName4 = name;
        this.additionPrice4 = price;
    }


    public double itemizeBurger() {

        double itemizedPrice = this.price;

        System.out.println("Base Price of " + this.name + "with the meat" + this.meat +
                "on the bread " + this.breadType + " is $ " + this.price);

        if(this.additionName1!=null) {
            itemizedPrice += this.additionPrice1;
            System.out.println("Adding " + this.additionName1 + " for price ->" + this.additionPrice1);
        }

        if(this.additionName2!=null) {
            itemizedPrice += this.additionPrice2;
            System.out.println("Adding " + this.additionName2 + " for price ->" + this.additionPrice2);
        }

        if(this.additionName3!=null) {
            itemizedPrice += this.additionPrice3;
            System.out.println("Adding " + this.additionName3 + " for price ->" + this.additionPrice3);
        }

        if(this.additionName4!=null) {
            itemizedPrice += this.additionPrice4;
            System.out.println("Adding " + this.additionName4 + " for price ->" + this.additionPrice4);
        }

        return itemizedPrice;

    }
}
