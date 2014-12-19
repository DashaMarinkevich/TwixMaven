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
public class LeftTwixStore extends TwixStore {

    private boolean empty;
    private boolean boil;
    private static LeftTwixStore unique;

    private LeftTwixStore() {
        empty = true;
        boil = false;
    }

    public static LeftTwixStore getIntense() {
        if (unique == null) {
            unique = new LeftTwixStore();
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
        if (type.equals("Left_Sticks")) {
            return new LeftStickTwix();
        } else {
            return null;
        }
    }
}
