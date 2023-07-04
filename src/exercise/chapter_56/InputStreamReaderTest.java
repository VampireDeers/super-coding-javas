package exercise.chapter_56;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args){

        int i;
        StringBuilder sb1 = new StringBuilder();
        try {
            while( (i = System.in.read()) != '\n'){
                sb1.append((char) i);
            }
            System.out.println("InputStream 적용 전: " + sb1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int j;
        StringBuilder sb2 = new StringBuilder();
        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            while( (j = isr.read()) != '\n'){
                sb2.append((char) j);
            }
            System.out.println("InputStream 적용 후: " + sb2.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
