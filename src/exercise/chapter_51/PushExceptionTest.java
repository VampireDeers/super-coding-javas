package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {

    public static void main(String[] args) {

        try {
            printFile("src/exercise/chapter_51/test2.txt");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    static void printFile(String fileName) throws FileNotFoundException, IOException {

        FileInputStream fs = getFileStream(fileName);
        int i;

        while((i = fs.read()) != -1){
            System.out.write(i);
        }
    }

    static FileInputStream getFileStream(String filename) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream(filename);
        return fs;
    }
}
