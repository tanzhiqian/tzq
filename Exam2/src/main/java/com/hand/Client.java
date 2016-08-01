package com.hand;

import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",12345);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
			
			File file = new File("target.pdf");
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			
			int i;
			while ((i = bufferedInputStream .read()) != -1) {
				bufferedOutputStream.write((byte) i);
			}
			
			bufferedOutputStream.close();
			fileOutputStream.close();
			bufferedInputStream.close();
			socket.close();
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}