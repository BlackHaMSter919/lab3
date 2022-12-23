package Noise;

import Enumaretion.Adjective;
import OtherObjects.Room;

public class Crash extends Noise{
    private Adjective adjective;

    public Crash(String n, Adjective a) {
        super(n);
        this.adjective = a;
    }


    @Override
    public void MakeNoise(Room o) {
        o.ChooseDirection(); System.out.println("донесся " + adjective + " " + name);

    }
}
