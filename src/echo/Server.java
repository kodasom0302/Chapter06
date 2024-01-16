package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		//서버 소켓 생성
		ServerSocket serverSocket=new ServerSocket();
		
		//바인딩
		InetSocketAddress aaa=new InetSocketAddress("192.168.137.1", 10001);
		serverSocket.bind(aaa);
		
		//서버 시작
		System.out.println("<서버 시작>");
		System.out.println("===============================================");
		System.out.println("[연결을 기다리고 있습니다.]");
		
		//클라이언트가 접속하면 실행
		Socket socket=serverSocket.accept();
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		serverSocket.close();
		socket.close();

	}

}
