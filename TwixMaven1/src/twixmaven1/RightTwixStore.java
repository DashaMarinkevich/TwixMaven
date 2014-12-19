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
public class RightTwixStore extends TwixStore {//реализация . метода createTwix абстрактного класса TwixStore

    private boolean empty;
    private boolean boil;
    private static RightTwixStore unique;

    private RightTwixStore() {
        empty = true;
        boil = false;
    }

    public static RightTwixStore getIntense() {
        if (unique == null) {
            unique = new RightTwixStore();
        }
        return unique;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boil = false;
        }
    }

    private boolean isEmpty() {
        return boil;
    }

    @Override
    protected Twix createTwix(String type) {
        if (type.equals("Right_Sticks")) {
            return new RightStickTwix();
        } else {
            return null;
        }
    }
}
