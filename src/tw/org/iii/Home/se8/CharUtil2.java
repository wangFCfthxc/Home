package tw.org.iii.Home.se8;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharUtil2 {

	public static void dump(Reader src, Writer dest)  {
		try(Reader input = src; Writer output = dest){
			char[] data = new char[1024];
			int length;
			while((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void dump(InputStream src, OutputStream dest, String charset) throws IOException {
		dump(
	            new InputStreamReader(src, charset), 
	            new OutputStreamWriter(dest, charset)
	        );
	}
	
	// 採用預設編碼
    public static void dump(InputStream src, OutputStream dest) 
                           throws IOException {
        dump(src, dest, System.getProperty("file.encoding"));
    }
	

}
