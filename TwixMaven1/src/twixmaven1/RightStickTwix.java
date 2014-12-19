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
public class RightStickTwix extends Twix {//переопределяются методы абстрактного класса Twix

    public RightStickTwix() {//правая полочка готовится с молочным шокол.
        name = "Right Sticks Twix";
        chocol = "milk chocolate";
        caramel = "fondant caramel ";
        cake = " shortbread";

    }

    public void poured() {//переопределяем метод покрытия карамели
        System.out.println("Pour on cookie caramel vertically");
    }

    public void box() {//переопредел. метод упаковки
        System.out.println("Place twix in official TwixStore box for the RightStick");
    }

}
