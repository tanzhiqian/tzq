package com.hand;

import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12345);
			Socket socket = server.accept();
			System.out.println("客户端已运行！");
			
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
			FileInputStream fileInputStream = new FileInputStream("D:/target.pdf");
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			
			int i;
			while ((i = bufferedInputStream.read()) != -1) {
				bufferedOutputStream.write((byte) i);
			}
			
			bufferedOutputStream.close();
			bufferedInputStream.close();
			fileInputStream.close();
			socket.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}