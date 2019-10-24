package Entity;

import java.io.Serializable;

public class SuperPerson implements Serializable {
    private String Name;
    private String ability;
    private int Strength;

    public SuperPerson(String name, String ability) {
        Name = name;
        this.ability = ability;
        this.Strength = (int) getRandomIntegerBetweenRange(0.0,10.0);
    }

    public SuperPerson() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

    public int getStrength() {
        return Strength;
    }
}

