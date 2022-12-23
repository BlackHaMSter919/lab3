package OtherObjects;

import Enumaretion.Adjective;
import Interface.Was;

public class Something implements Was {
    private String name;
    private Adjective adjective1;
    private Adjective adjective2;

    public Something(String n, Adjective a1, Adjective a2) {
        this.name = n;
        this.adjective1 = a1;
        this.adjective2 = a2;
    }

    public void Whip(Object o, Face f) {
        System.out.println(name + " " + adjective1.toString() + " и " + adjective2.toString() + " хлестнуло " + o.toString().substring(0, o.toString().length() - 1) + "у" + " по " + f.toString().substring(0, f.toString().length() - 1) + "у");

    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Something other = (Something) otherObject;
        return ((adjective1 == other.adjective1) && (name==other.name) && (adjective2==other.adjective2));
    }
    @Override
    public int hashCode(){
        int res = name.hashCode();
        res+= adjective1.hashCode()+adjective2.hashCode();
        return res;
    }

    @Override
    public String toString() {

        return (adjective1 + " " + name + "a");
    }

    @Override
    public void Was() {
        System.out.println(adverb.toString() + " " + name + " был " + adjective2.toString());

    }

}

