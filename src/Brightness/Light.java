package Brightness;

import Enumaretion.Adjective;
import Enumaretion.Adverb;

public class Light extends Brightness{
    private Adjective adjective1;
    private Adjective adjective2;
    private Adverb adverb;
    public Light(String n, Adjective a1, Adjective a2, Adverb a3) {
    super(n);
    this.adjective1=a1;
    this.adjective2=a2;
    this.adverb= a3;
    }
    public void Pour(){
        System.out.println(adverb.toString() +" " + adjective1.toString() +" "+ "лился "+ adjective2+" "+name);
    }
}
