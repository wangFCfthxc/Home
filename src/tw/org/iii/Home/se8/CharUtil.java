package tw.org.iii.Home.se8;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharUtil {

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

}
