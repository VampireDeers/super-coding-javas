package exercise.chapter_56;

import java.io.*;

public class BufferedStreamTest {

    public static void main(String[] args){

        try(FileReader fis = new FileReader("src/exercise/chapter_56/test_long.txt");
            FileWriter fws = new FileWriter("src/exercise/chapter_56/output_long.txt")
        ){
            long start = System.currentTimeMillis();

            int data;
            while ((data = fis.read()) != -1) {
                fws.write((char) data);
            }

            long end = System.currentTimeMillis();

            System.out.println("Buffered 적용 전, 파일 내용 복사하는데 " + (end - start) + "ms 가 걸렸습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ///
        try(BufferedReader bfr = new BufferedReader(new FileReader("src/exercise/chapter_56/test_long.txt"));
            BufferedWriter bfw = new BufferedWriter(new FileWriter("src/exercise/chapter_56/output_long.txt"))
        ){
            long start = System.currentTimeMillis();

            int data;
            while ((data = bfr.read()) != -1) {
                bfw.write((char) data);
            }

            long end = System.currentTimeMillis();

            System.out.println("Buffered 적용 후, 파일 내용 복사하는데 " + (end - start) + "ms 가 걸렸습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
