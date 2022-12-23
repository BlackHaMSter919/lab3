package Noise;

import OtherObjects.Room;

public class Rastle extends Noise {

    public Rastle(String n){
        super(n);
    }

    @Override
    public void MakeNoise(Room o){
        System.out.println("раздался " + name);
    }
}
