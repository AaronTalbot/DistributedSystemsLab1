package Factory;

import Entity.BadEyePerson;
import Entity.SuperPerson;

public class BadEyeFact extends SuperVillanFact {
    SuperPerson SVE;
    @Override
    public SuperPerson CreateObject() {
        return SVE = new BadEyePerson("Titano", "laser eyes");
    }
}
