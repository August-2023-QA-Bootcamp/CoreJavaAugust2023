package lec13_03_java_read_and_write;

import java.io.File;
import java.io.IOException;

public class C_creating_folder_and_file {

	public static void main(String[] args) {
		// Creating a Folder (file explorer)
		// for Mac user -- go to the properties -- if the folder name is August2023Batch --> /Users/YourName/Desktop/August2023Batch
		
		File folder = new File("C:\\Users\\Tofael\\Desktop\\August2023Batch");
		folder.mkdir(); // this method will create directory or folder -- interview question
		
		if(folder.exists()) {
			System.out.println(folder.getName() + " folder is created");
			
			// Creating a file now
			File file = new File("C:\\Users\\Tofael\\Desktop\\August2023Batch\\August2023.txt");
			try {
				file.createNewFile(); // this method create the file
			} catch (IOException e) {
				// e.printStackTrace(); // we can also use method of Exception class
				System.out.println("The exception occured is >>>>> " + e);
			}
			
			if (file.exists()) {
				System.out.println(file.getName() + " file is created inside the August2023Batch Folder");
			} else {
				System.out.println("Exception occured, file is not created");
			}
				
		} else {
			System.out.println("Folder is not created");
		}

	}

}
