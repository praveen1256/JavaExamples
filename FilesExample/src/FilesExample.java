import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Files Example");
//		storeDataInFile();
		readingDataFile();
	}

	public static void storeDataInFile() {
		
		File file = new File("./newfile.txt");
		String content = "My Data New";
		
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
				try {
					if(!file.exists()) {
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
				}finally {
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
			}finally {
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

}
