package lec16_02_java_read_and_write;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaReadAndWrite {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Creating a Folder (file explorer)
		// for Mac user -- go to the properties -- if the folder name is August2023Batch --> /Users/YourName/Desktop/August2023Batch
		
		File folder = new File("C:\\Users\\Tofael\\Desktop\\August2023Batch");
		folder.mkdir(); // this method will create directory or folder -- interview question
		// above line also can be inside try catch block
		
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
				
				// learning here from today (36-83)
				System.out.println("<-- Please write something about the students of August 2023 Batch -->");
				Scanner scanner = new Scanner(System.in);
				String userInput = scanner.nextLine();
				
				// how to write inside the file 42-50
				FileWriter fw = null;				
				try {
					fw = new FileWriter(file);
					fw.write(userInput); // write () from FileWriter class-- > help to write in the file
					fw.close();					
				} catch (Exception f) {
					System.out.println("Filewriter failed to write in the file");
					//f.printStackTrace(); // this method print the Exception or you can use sysout like line 26
				}
				
				System.out.println("Now go to the Desktop, open the folder, then the file and see what is written in the file");
				
				// File reader from 55-65
				String filePath = "C:\\Users\\Tofael\\Desktop\\August2023Batch\\August2023.txt";
				
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader(filePath); // FileReader read the location of the file
					System.out.println("FileReader find the location of the path as: " + filePath);
				} catch (Exception g) {
					g.printStackTrace();
				}
				
				// buffered Reader from 68-83
				String data = " ";
				try {
					br = new BufferedReader(fr); // BufferedReader buffer the content /data of the file
					while ((data = br.readLine()) != null) {
						System.out.println("The BufferedReader read the file and got:  " + data);					
					}
				} catch (Exception h) {
					h.printStackTrace();
				} finally {
					if (fr != null) {
						fr = null; // If fr is not null, make it null, mean close the resource.
					}
					if (br != null) {
						br = null; // If br is not null, make it null, mean close the resource.
					}
				}
			
			} else {
				System.out.println("Exception occured, file is not created");
			}
				
		} else {
			System.out.println("Folder is not created");
		}

	}

}
