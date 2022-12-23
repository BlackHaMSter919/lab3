package OtherObjects;

import Enumaretion.Adjective;
import Enumaretion.Adverb;

public class Sword {
    private String name;
    private Adjective adjective1;
    private Adjective adjective2;
    private Adverb adverb;

    public Sword(String n, Adjective a1, Adjective a2, Adverb a3) {
        this.name = n;
        this.adjective1 = a1;
        this.adjective2 = a2;
        this.adverb =a3;
    }
    @Override
    public String toString() {

        return name;
    }

    public String toString1() {

        return adjective1+" " + adjective2+" " +name+" "+adverb+" в ";
    }
    public void Punch(Hole o) {
        System.out.println(name + " пробил " + o.toString().substring(0,o.toString().length()-1)+ "у,");

    }
}
