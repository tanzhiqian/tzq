package com.hand;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		URL url;
		try {
			url = new URL("http://files.saas.hand-china.com/java/target.pdf");
			URLConnection urlConnection = url.openConnection();
			InputStream inputStream = urlConnection.getInputStream();
			BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

			byte[] b = new byte[1024];
			FileOutputStream fileOutputStream = new FileOutputStream("D:/上机编程题2-1.pdf", true);
			int count = bufferedInputStream.read(b, 0, 1023);
			while (count > 0) {
				fileOutputStream.write(b, 0, count);
				count = bufferedInputStream.read(b, 0, 1023);
			}

			fileOutputStream.close();
			bufferedInputStream.close();
			inputStream.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
