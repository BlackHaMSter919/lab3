package OtherObjects;

import Enumaretion.Adverb;

public class Room {
    private String name;
    private String articleName;
    private Adverb adverb;

    public Room(String n, String an, Adverb a) {
        this.name = n;
        this.articleName = an;
        this.adverb = a;
    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (getClass() != otherObject.getClass()) return false;
        Room other = (Room) otherObject;
        return ((articleName == other.articleName) && (name==other.name) && (adverb==other.adverb));
    }
    @Override
    public int hashCode() {
        int res = name.hashCode();
        res += adverb.hashCode() + articleName.hashCode();
        return res;
    }

    public void ChooseDirection() {
        if (articleName == "из" & name == "зал") {
            System.out.print(adverb +" " +articleName+" "+ name + "а ");
        }
        if (articleName == "в" & name == "коридор") {
            System.out.println(" " +articleName +" "+ name);
        }
        if (articleName == "в" & name == "зал") {
            System.out.print(articleName+" " + name + "е ");
        }

    }
}
