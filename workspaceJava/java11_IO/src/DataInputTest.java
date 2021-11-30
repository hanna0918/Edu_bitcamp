import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputTest {

	public DataInputTest() {
		try {
			File f = new File("C://Users/82108/Desktop/fileTest", "data.txt");
			FileInputStream fis = new FileInputStream(f);
			DataInputStream dis = new DataInputStream(fis);
			
			// int -> double -> boolean -> char ¼ø¼­
			int intData = dis.readInt();
			double dbData = dis.readDouble();
			boolean booData = dis.readBoolean();
			char charData = dis.readChar();
			
			System.out.println(intData);
			System.out.println(dbData);
			System.out.println(booData);
			System.out.println(charData);
			
			
		}catch(Exception e) {}
	}

	public static void main(String[] args) {
		new DataInputTest();

	}

}
