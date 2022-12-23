package Brightness;

import Enumaretion.Adjective;
import OtherObjects.Room;

public class Dark extends Brightness{
    private Adjective adjective;

    public Dark(String n, Adjective a) {
        super(n);
        this.adjective=a;
    }
    public void Stay(Room o) {
        o.ChooseDirection();
        System.out.println("стояла " + adjective.toString()+" "+ name);
    }
}
