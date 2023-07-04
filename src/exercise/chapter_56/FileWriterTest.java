package exercise.chapter_56;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args){
        String content = "이것은 파일 컨텐츠 입니다.";

        try(FileWriter fos = new FileWriter("src/exercise/chapter_56/output_korean.txt")){
            fos.write(content);

            System.out.println("txt 파일이 생성되었습니다.");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }
