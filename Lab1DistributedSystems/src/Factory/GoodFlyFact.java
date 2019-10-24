package Factory;

import Entity.GoodFlyPerson;
import Entity.SuperPerson;

public class GoodFlyFact extends MakeSuperHero {
    SuperPerson GF;

    @Override
    public SuperPerson CreateObject() {
        return GF = new GoodFlyPerson("Clark Kent", "fly");
    }
}
