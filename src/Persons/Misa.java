package Persons;

public class Misa extends Person{
    public Misa(String n) {
        super(n);


    }
    public void Screaming(Object o) {
        System.out.println("до ниx донесся " + o.toString()+" " + name.substring(0,o.toString().length()-1) +"ы");

    }
}
