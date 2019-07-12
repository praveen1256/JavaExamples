import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FilesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Files Example");
//		storeDataInFile();
//		readingDataFile();
//		storeObjectsInFile();
		readObjectsFromFile();
	}

	public static void storeDataInFile() {

		File file = new File("./newfile.txt");
		String content = "My Data New";

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			try {
				if (!file.exists()) {
					file.createNewFile();
				}
				byte[] data = content.getBytes();
				fileOutputStream.write(data);
				System.out.println("Data Stored");
				fileOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Storing Exception");
			} finally {
				try {
					fileOutputStream.close();
					System.out.println("Finally Try Close");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Finally Exception");
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Catch FileNotFoundException");
		}

	}

	public static void readingDataFile() {

		File file = new File("./newfile.txt");
		BufferedReader bufferedReader;
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			try {
				String dataInFile = bufferedReader.readLine();
				System.out.println(dataInFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void storeObjectsInFile() {

		Student student1 = new Student();
		student1.setName("Kumar");
		File file = new File("./Objects.txt");

		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(student1);
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("Object Successfully Stored In File");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void readObjectsFromFile() {

		File file = new File("./Objects.txt");

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			try {
				Student student = (Student)objectInputStream.readObject();
				System.out.println("Object Successfully Read. Student Name is "+student.getName());
				objectInputStream.close();
				fileInputStream.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
