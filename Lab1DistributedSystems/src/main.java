import Entity.Supervillian;
import Factory.CreatePerson;
import Serialize.Serializable;

public class main {

    public static void main(String[] args){
        String[] abilities = {"fly","strong","laser eyes", "telepathy","speed"};
        int randint = (int) getRandomIntegerBetweenRange();
        String Abil = abilities[randint];
        CreatePerson CP = new CreatePerson();
        Supervillian SV;
        SV = CP.CreateVillian(Abil);
        Serializable S = new Serializable();
        S.SerializeVillan(SV);

    }

    public static double getRandomIntegerBetweenRange(){
        double x = (int)(Math.random()*((4-0)+1))+0;
        return x;
    }

}
