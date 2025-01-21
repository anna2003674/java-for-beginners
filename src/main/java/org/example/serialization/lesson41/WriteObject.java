package org.example.serialization.lesson41;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        People[] people = {new People(1, "Bob"), new People(2, "Mike"), new People(3, "Tom")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);

            for (People person : people) {
                oos.writeObject(person);

            }

            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
