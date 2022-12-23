package OtherObjects;

import Enumaretion.Adjective;

public class DustCloud {
    private String name;
    private Adjective adjective ;
    public DustCloud(String n, Adjective a){
        this.adjective=a;
        this.name=n;
    }

    public void RaiseUp(Object o){
        System.out.println(adjective.toString()+" "+name+" поднялось " + "c" +" "+ o.toString());

    }
}
