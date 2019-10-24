package Factory;

import Entity.BadStrongMan;
import Entity.SuperPerson;

public class BadStrongFacT extends SuperVillanFact {
    SuperPerson BadS;

    @Override
    public SuperPerson CreateObject() {
        return BadS = new BadStrongMan("Silver Surfer", "Strong");
    }
}
