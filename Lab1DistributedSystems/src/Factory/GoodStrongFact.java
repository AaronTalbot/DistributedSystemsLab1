package Factory;

import Entity.GoodStrongMan;
import Entity.SuperPerson;

public class GoodStrongFact extends MakeSuperHero {
    SuperPerson GSM;
    @Override
    public SuperPerson CreateObject() {
        return GSM = new GoodStrongMan("Thor", "strong");
    }
}
