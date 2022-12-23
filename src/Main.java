import Brightness.*;
import Enumaretion.*;
import Noise.*;
import OtherObjects.*;
import Persons.*;

public class Main {
    public static void main(String[] args) {
        Face face= new Face("лицо");
        Eyes eyes = new Eyes("глаза");
        Homsa homsa = new Homsa("Хомса", face, eyes);
        Sword sword = new Sword("меч", Adjective.HIS,Adjective.WOODEN, Adverb.STRAIGHT);
        Misa misa = new Misa("Миса");
        Something something1 = new Something("что-то",Adjective.BIG,Adjective.SOFT);
        Something something2 = new Something("враг",Adjective.INVISIBLE, Adjective.CLOTH);
        Shelves shelves = new Shelves("полки");
        Room room1= new Room("зал","из",Adverb.HERE);
        Room room2= new Room("зал","в",Adverb.HERE);
        Room room3= new Room("коридор","в",Adverb.HERE);
        Hole hole = new Hole("дыра");
        DustCloud dustCloud = new DustCloud("облако пыли",Adjective.EASY);
        Light light = new Light("свет", Adjective.WHICH,Adjective.DAILY,Adverb.TROUGH);
        Dark dark = new Dark("тьма",Adjective.PITCH);
        Crash crash = new Crash("грохот", Adjective.SCARAY);
        Rastle rastle= new Rastle("шелест");
        Scream scream= new Scream("крик");

        crash.MakeNoise(room1);
        dustCloud.RaiseUp(shelves);
        homsa.Grab(sword);
        if ((!room1.equals(room3))&&(!room2.equals(room3))){   homsa.Rush(room3);}
        misa.Screaming(scream);
        if ((!room1.equals(room2))&&(!room3.equals(room2))){dark.Stay(room2);}
        something1.Whip(homsa,face);
        homsa.Blink();
        if (!something1.equals(something2)) { homsa.Plunge(sword,something2);}
        if ((room1.hashCode()!=room3.hashCode())&&(room2.hashCode()!=room3.hashCode())){   rastle.MakeNoise(room3);}
        if (something2.hashCode()!=something1.hashCode()){ something2.Was();}
        homsa.DecideToOpen(eyes);
        homsa.HadSeen();
        sword.Punch(hole);
        light.Pour();



    }
}