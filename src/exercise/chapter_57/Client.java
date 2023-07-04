package exercise.chapter_57;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args){
        // TODO: 서버에 연결
        try(Socket socket = new Socket("localhost", 1234)){ // 서버연결

            // 서버로 데이터를 보내기 위한 OutputStream 생성
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            // 서버로부터 데이터를 받기 위한 InputStream 생성
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Customer customer = new Customer("ID113", "아이유");
            // 서버에 메시지 전송
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            // 서버로부터 받은 응답 출력
            String response = bufferedReader.readLine();
            System.out.println("서버의 응답(고객대기리스트): " + response);

            System.out.println("Client가 종료되었습니다.");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
