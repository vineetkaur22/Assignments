import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Question2 {

	public static void parse(File file)  {
		RandomAccessFile input = null;
		String line = null;
		try {
			input = new RandomAccessFile(file, "r");
			while ((line = input.readLine()) != null) {
				System.out.println(line);
			}
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (input != null) {
				try{
					input.close();
				}
				catch (IOException e) {
					System.out.println("Couldn't close file");
				}
			}
		}
	}
}
