package Factory;

import Entity.BadEyePerson;
import Entity.BadTelepathyPerson;
import Entity.SuperPerson;

public class BadTelepathyFact extends SuperVillanFact {
    SuperPerson SVE;
    @Override
    public SuperPerson CreateObject() {
        return SVE = new BadTelepathyPerson("Scarlet witch", "telepathy");
    }


}
