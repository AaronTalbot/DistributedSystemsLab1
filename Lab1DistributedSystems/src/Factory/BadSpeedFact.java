package Factory;

import Entity.BadSpeedPerson;
import Entity.SuperPerson;

public class BadSpeedFact extends SuperVillanFact {
    SuperPerson SV;
    @Override
    public SuperPerson CreateObject() {
        return SV = new BadSpeedPerson("Dark Flash", "speed");

    }
}
