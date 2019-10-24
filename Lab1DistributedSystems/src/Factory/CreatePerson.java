package Factory;

import Entity.Supervillian;

public class CreatePerson {
    public Supervillian CreateVillian(String Ability){
        Supervillian SV = null;
        if (Ability.equals("fly")){
            BadFlyFact F = new BadFlyFact();
            SV = (Supervillian) F.CreateObject();
        }
        else
            if(Ability.equals("strong")){
                BadStrongFacT F = new BadStrongFacT();
                SV = (Supervillian) F.CreateObject();
            }
        else
            if(Ability.equals("laser eyes")){
                BadEyeFact F = new BadEyeFact();
                SV = (Supervillian) F.CreateObject();
            }
        else
            if (Ability.equals("telepathy")){
                BadTelepathyFact F = new BadTelepathyFact();
                SV = (Supervillian) F.CreateObject();
            }
        else
            if (Ability.equals("speed")){
                BadSpeedFact F = new BadSpeedFact();
                SV = (Supervillian) F.CreateObject();
            }
        return SV;
    }



}


