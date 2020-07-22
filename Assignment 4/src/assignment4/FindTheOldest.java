package assignment4;

import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindTheOldest {
public static void main(String[] args) throws IOException{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the name of the file to read: "); //enter file name
	String filename = scanner.nextLine();
	
	System.out.println();
	
	FileReader filereader = new FileReader(filename); 
	BufferedReader buffreader = new BufferedReader(filereader);
	
	String line; 
	
	HashMap<String, Integer> map = new HashMap<>();
	while((line = buffreader.readLine()) != null){
		
		String[] i = line.split(" ");
		String name = i[0];
		int number = Integer.parseInt(i[1]);
		
		map.put(name, number); //adding name and number into hash map
	}
	
	int returnValue = -1;
	String returnKey ="";
	for(String key : map.keySet()) { //if key in map
		int value = map.get(key); //value = key in map
		if(value > returnValue) { //checks if value is greater than returnValue
			returnValue = value;
			returnKey = key;
		}
	}
	System.out.print(returnKey);
	buffreader.close();
	filereader.close();
	scanner.close();
}	
}
