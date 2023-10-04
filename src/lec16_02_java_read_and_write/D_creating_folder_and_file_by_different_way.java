package lec16_02_java_read_and_write;

import java.io.File;

// Extra knowledge, if interested so, different way to create folder and file
// But the previous one is the popular
public class D_creating_folder_and_file_by_different_way {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Tofael\\Desktop\\Enthrall\\Students.txt");
		try {
			file.getParentFile().mkdir();
			file.createNewFile();
		} catch (Exception e) {
			System.out.println("The error message is: " + e);
		}
		System.out.println("Please go to the Path and find the file inside Folder");
	}
}
