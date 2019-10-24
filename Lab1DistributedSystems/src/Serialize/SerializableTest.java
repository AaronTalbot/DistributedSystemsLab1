package Serialize;

import Entity.GoodStrongMan;
import Entity.SuperPerson;

import java.io.*;

public class SerializableTest {

    public static void main(String[] args)
    {
        SuperPerson S1 = new GoodStrongMan("Jeff", "Strong");
        String filename = "Battle-zones.ser";

        SuperPerson object1 = null;

        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (SuperPerson) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("Name = " + object1.getName());
            System.out.println("Ability = "  +  object1.getAbility());

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

    }
}
