package Noise;

import OtherObjects.Room;

abstract public class Noise {
    protected String name;
    public Noise(String n) {
        this.name = n;
    }

    public abstract void MakeNoise(Room o);



}
