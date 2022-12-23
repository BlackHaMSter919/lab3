package Noise;


import OtherObjects.Room;

public class Scream extends Noise{
    public Scream(String n) {
        super(n);
    }
    @Override
    public String toString() {

        return name;
    }

    @Override
    public void MakeNoise(Room o) {

    }


}
