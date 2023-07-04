package exercise.chapter_57;

import java.io.*;

public class SerializeExampleTest {

    public static void main(String[] args) {
        // 직렬화
        Person person = new Person("이순신", "Male", 30, "Korea", "장수");

        byte[] serializedData = null;

        try(ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);
        ){
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();

            serializedData = bao.toByteArray();
            System.out.println("Person 직렬화 후: " + new String(serializedData));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 역직렬화 중
        try(ByteArrayInputStream bio = new ByteArrayInputStream(serializedData);
            ObjectInputStream objectInputStream = new ObjectInputStream(bio);
        ){
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("직렬화된 Data가 다시 Person으로 역직렬화 후: " + person1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
