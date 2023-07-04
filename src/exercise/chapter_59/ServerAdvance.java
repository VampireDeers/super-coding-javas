package exercise.chapter_59;

import exercise.chapter_57.Customer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>(); // 고객 대기 리스트

        try(ServerSocket serverSocket = new ServerSocket(1234); // 서버 소켓 생성
        ){
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + "서버가 시작되었습니다.");

            while(true) {
                try {
                    Socket clientSocket = serverSocket.accept(); // 클라이언트 접속
                    Thread request = new Thread(new RequestHandler(clientSocket, customerList));
                    request.start();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
