package tw.org.iii.Home.se8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedIO {

	public static void dump(InputStream src, OutputStream dest) throws IOException {
		try (InputStream input = new BufferedInputStream(src); OutputStream output = new BufferedOutputStream(dest)) {
			byte[] data = new byte[1024];
			int length;
			while ((length = input.read(data)) != -1) {
				output.write(data, 0, length);
			}
		}
	}
}
