package Persons;

import Interface.Grabbed;
import OtherObjects.Eyes;
import OtherObjects.Face;
import OtherObjects.Room;
import OtherObjects.Sword;

public class Homsa extends Person implements Grabbed {
    private Face face;
    private Eyes eyes;
    public Homsa(String n, Face f, Eyes e){
        super(n);
        this.face =f;
        this.eyes =e;
    }
    public void Rush(Room o){
        System.out.print(name +" "+"бросился");
        o.ChooseDirection();
    }
    public  void  Blink(){
        System.out.println(name + " заморгал");
    }
    public void DecideToOpen(Eyes o){
        System.out.println(name+ " "+ "решился открыть "+ o.toString());
    }
    public void HadSeen(){
        System.out.println(name + " увидел, что");
    }
    public void Plunge(Sword o, Object f){
        System.out.println(name + " вонзил "+ o.toString1() + f.toString());
    }
    @Override
    public void Grab(Object other) {
            System.out.println(name+ " " + "схватился за "+ other.toString());


        }
    @Override
    public String toString() {

        return name;
    }

    }

