/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twixmaven1;

/**
 *
 * @author Dasha-RV515
 */
public class LeftStickTwix extends Twix {

    public LeftStickTwix() {//левая полочка готовится с темным шокол.
        name = "Left Sticks Twix";
        chocol = "dark chocolate";
        caramel = "fondant caramel ";
        cake = " shortbread";
        toppings.add(" Milk");
    }

    public void poured() {//переопределяем метод покрытия карамели
        System.out.println("Pour on cookie caramel from top to bottom");
    }

    public void box() {//переопредел. метод упаковки
        System.out.println("Place twix in official TwixStore box for the LeftStick");
    }

}
