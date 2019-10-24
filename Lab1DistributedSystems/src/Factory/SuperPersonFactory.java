package Factory;

import Entity.GoodFlyPerson;
import Entity.GoodStrongMan;
import Entity.SuperHero;
import Entity.SuperPerson;

public interface SuperPersonFactory {

    public SuperPerson CreateObject();

}
