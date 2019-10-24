package Factory;


import Entity.BadFlyPerson;
import Entity.SuperPerson;
import Entity.Supervillian;

public class BadFlyFact extends SuperVillanFact {
    Supervillian SV;

    @Override
    public SuperPerson CreateObject() {
        SV =   new BadFlyPerson("Mysterio","Fly");
        return SV;
    }
}
