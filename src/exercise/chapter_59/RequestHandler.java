package exercise.chapter_59;

import exercise.chapter_57.Customer;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable {

    private Socket clientSocket;
    private List<Customer> customerList; // 대기 명단

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customerList = customerList;
    }

    @Override
    public void run() {

        try {
            System.out.println("클라이언트가 접속하였습니다.");

            // 클라이언트로부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputstream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(clientInputstream);

            // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

            Customer customer = (Customer) objectInputStream.readObject();

            ListUtils.addList(customerList, customer);
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + customer + "가 대기명단에 추가되었습니다.");

            printWriter.println("현재 고객대기명단은: " + customerList);

            clientSocket.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
