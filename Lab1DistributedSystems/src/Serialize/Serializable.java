package Serialize;

import Entity.SuperPerson;

import java.io.*;
public class Serializable {
    private String filename = "Battle-zones.ser";
    public void SerializeVillan(SuperPerson v){
        try
        {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(v);

            out.close();
            file.close();

            System.out.println("Object has been serialized");

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

    }

    public String DeSerializeVillian(){
        SuperPerson p;
        String re = "";
        // Deserialization
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            p = (SuperPerson) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            re += p.getAbility();

        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

        return re;
    }
}
