/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twixmaven1;

import java.util.ArrayList;

/**
 *
 * @author Dasha-RV515
 */
public abstract class Twix {//является супер классом для конкретных видов Twix

    String name;//каждый обьект содержит имя ,вид шоколада,карамели , печенья
    String chocol;
    String caramel;
    String cake;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return name;
    }

    public String getCaramel() {
        return caramel;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Bake cookies...");
        System.out.println("Caramel poured on biscuits ..." + caramel);
        System.out.println("Cover chocolate ...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));//выполняем приготовления в определенном порядке
        }
    }

    public void bake() {
        System.out.println("Bake  cookies for 30  minutes at 300");
    }

    public void poured() {
        System.out.println("Pour on cookie caramel ");
    }

    public void cover() {
        System.out.println("Cover   on cookie chocolate");
    }

    public void box() {
        System.out.println("Place twix in official TwixStore box");
    }

}
