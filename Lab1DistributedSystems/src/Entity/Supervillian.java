package Entity;

public class Supervillian extends SuperPerson {
    private static String Type;

    public Supervillian(String name, String ability) {
        super(name, ability);
        Type = "Vilian";
    }

    public static String getType() {
        return Type;
    }

    public static void setType(String type) {
        Type = type;
    }
}
