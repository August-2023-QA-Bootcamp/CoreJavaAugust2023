package lec16_01_string_manipulation;

import java.util.Arrays;

// Mostly interview question
// Use the concept in Java coding challenge
// sometimes the concept is used inside framework to retrieve data

public class UseOfString {

	public static void main(String[] args) {
		String s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		// The below one is used to print the Error
		// System.err.println(s);
		// The Java String class length() method finds the length of a string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s + "\n");
		System.out.println("The length of the String is: " + s.length());
		
		// The java string toUpperCase() method returns the string in upper case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toUpperCase());
		System.out.println(s); // String is Immutable that's why it's value is not changed
		
		// The java string toLowerCase() method returns the string in lower case letter.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.toLowerCase());
		
		// charAt() -- Returns the char value at the specified index.
		// The index number starts from 0 and goes to n-1, where n is the length of the string. 
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character at a specific position(0): " + s.charAt(0));
		System.out.println("\nThe character at a specific position(10): " + s.charAt(10));
		System.out.println("\nThe character at a specific position(100): " + s.charAt(100));
		System.out.println("\nThe character at a specific position(111): " + s.charAt(111));
		// System.out.println("\nThe character at a specific position(112): " + s.charAt(112)); // will show StringIndexOutOfBoundsException

		// We can even change the value of variable, no need of mention the variable type
		System.out.println("\n------------------------------------------------------------------------");
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		System.out.println(s);
		
		// The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe character 'L' is, at the position of: " + s.indexOf('L')); // String indexing starts from 0
		System.out.println("\nThe character 'V' is, at the position of: " + s.indexOf('V')); 
		System.out.println("\nThe character 'l' is, at the position of: " + s.indexOf('l')); // case sensitive, 
		System.out.println("\nThe character 'r' is, at the position of: " + s.indexOf('r')); // if present more than one, the first own is recognized
		System.out.println("\nThe character 'x' is, at the position of: " + s.indexOf('x')); // if any character is absent, it shows -1.

		
		// Returns the index within this string of the first occurrence of the specified substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe index of 'dolor' word is in : " + s.indexOf("dolor"));
		System.out.println("\nThe index of 'Dolor' word is in : " + s.indexOf("Dolor")); // case sensitive
		System.out.println("\nThe index of 'debitis' word is in : " + s.indexOf("debitis maiores nemo"));
		System.out.println("\nThe index of 'pariatur' word is in : " + s.indexOf("pariatur nulla?"));
		
		System.out.println("\n------------------------------------------------------------------------");
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas maiores nemo modi! Alias pariatur nulla?";
		// Tough: 01
		// Please see this part carefully
		// To know the position of the repetitive character in which index we follow below formula:
		// s.indexOf('a', s.indexOf('a')+1))
		System.out.println("\nThe first 'r' character is - at the position of: " + s.indexOf('r')); 
		System.out.println("\nThe second 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r') + 1)); 
		// Knowing above line is more than enough, no need of below 2 lines
		System.out.println("\nThe third 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r', s.indexOf('r')+2)+1));
		System.out.println("\nThe fourth 'r' character is - at the position of: " + s.indexOf('r', s.indexOf('r', s.indexOf('r', s.indexOf('r') + 3) + 2) + 1 ));
		// Another example
		System.out.println("\nThe second 'o' character is - at the position of: " + s.indexOf('o', s.indexOf('o')+1));
		System.out.println("\nThe third 'o' character is - at the position of: " +s.indexOf('o', s.indexOf('o', s.indexOf('o')+2)+1));
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe first dolor String is - at the position of: " + s.indexOf("dolor")); 
		System.out.println("\nThe second dolor String is - at the position of: " + s.indexOf("dolor", s.indexOf("dolor") + 1)); 
		
		// last occurrence of a character by lastIndexOf()
		// The Java String class lastIndexOf() method returns the last index of the given character value or substring.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe first 'r' character is - at the position of: " + s.indexOf('r')); 
		System.out.println("\nThe last 'r' character is - at the position of: " + s.lastIndexOf('r')); 
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("\nThe first occurance of 'dolor' word is in : " + s.indexOf("dolor"));
		System.out.println("\nThe last occurance of 'dolor' word is in : " + s.lastIndexOf("dolor"));
		
		s = "Lorem ipsum dolor sit amet consectetur adipisicing dolor elit. Voluptas tempora ebitis maiores nemo modi! Alias pariatur nulla?";
		// The java string substring() method returns a part of the string.
		// this substring is important method
		// Returns a string that is a substring of the original string. The substring begins at the specified beginIndex and 
		// extends to the character at index (endIndex - 1). Please remember it, here upper limit is excluded
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s.substring(19)); // begin index 19, last index = end index
		System.out.println(s.substring(19, 25)); // begin index 19, last index = end index - 1
		System.out.println(s.substring(65, 70));
		
		// equals() method is used to compare Strings and return a boolean value
		// Returns 'true' if the given object represents a String equivalent to this string, 'false' otherwise
		System.out.println("\n------------------------------------------------------------------------");
		String s1 = "My name is John. ";
		String s2 = "My name is John. ";
		String s3 = "my name is john. ";
		String s4 = "MY NAME IS JOHN. ";
		
		System.out.println("Is s1 equal to s2? Ans: " + s1.equals(s2));
		System.out.println("Is s1 equal to s3? Ans: " + s1.equals(s3));
		System.out.println("Is s1 equal to s4? Ans: " + s1.equals(s4));
		System.out.println("Is s3 equal to s4? Ans: " + s3.equals(s4));
		
		System.out.println("\n------------------------------------------------------------------------");
		// == is used in int
		int i = 20;
		int j = 20;
		int k = 25;
		System.out.println(i==j);
		System.out.println(i==k);
		System.out.println(j==k);
		
		s1 = "My name is John. ";
		s2 = "My name is John. ";
		s3 = "my name is john. ";
		s4 = "MY NAME IS JOHN. ";
		
		// How about String
		// We can also use == equal to ---> to compare 2 string, but need to be careful for line 127
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s1==s2);
		System.out.println("Is it True? Ans: " + s1==s2); 
		// Why false? get it? because "xxxxxxx" + s1 ----> is concatenating and then comparing with s2
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how we can solve that issue? one way below -
		// Using 2 String methods together. first convert them to upper or lower case, then compare
		System.out.println(s3.toUpperCase().equals(s4));
		System.out.println(s4.toLowerCase().equals(s3));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s5 = "my name is john. ";
		String s6 = "MY name IS JOHN. "; // here, name is not Upper case
		System.out.println(s5.toUpperCase().equals(s6));
		System.out.println(s5.toUpperCase().equals(s6.toUpperCase()));
		
		s3 = "my name is john. ";
		s4 = "MY NAME IS JOHN. ";
		// Two strings are considered equal ignoring case if they are of the same length
		// and corresponding characters in the two strings are equal ignoring case.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println(s3.equals(s4)); // how that can be solved? one way below -
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// The java string trim() method eliminates leading and trailing spaces. interview question
		// To avoid white space: trim() us used -- (it remove any leading and trailing whitespace)
		System.out.println("\n------------------------------------------------------------------------");
		String s7 = "         HelloWorld.        ";
		System.out.println("Before Trim: " + s7);
		System.out.println("After Trim: " + s7.trim());
		
		// can't remove white space Between Words
		System.out.println("\n------------------------------------------------------------------------");
		String s8 = "    Hello       World!    ";
		System.out.println("Before Trim: " + s8);
		System.out.println("After Trim: " + s8.trim()); // Please see solution at line 186
		
		// The java string replace() method returns a string replacing all the old char
		// or CharSequence to new char or CharSequence.
		// To replace we use replace() method
		// Returns a string resulting from replacing all occurrences of oldChar in this
		// string with newChar.
		System.out.println("\n------------------------------------------------------------------------");
		String s9 = "Good morning mom";
		System.out.println("Before replace: " + s9);
		System.out.println("After replacing by Character: " + s9.replace('m', 'M'));
		System.out.println("After replacing by String: " + s9.replace("mom", "Dad"));
		
		// replace() can't trim
		System.out.println("\n------------------------------------------------------------------------");
		String s10 = "      GooD Morning      ";
		System.out.println("Replacing can't move white space: " + s10.replace('D', 'd'));
		// We can use trim() and replace() together
		System.out.println("After triming and replacing: " + s10.trim().replace('D', 'd'));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s11 = "      Good    MoRning      ";
		System.out.println("Before Triming and replacing: " + s11);
		System.out.println("After Triming and replacing: " + s11.trim().replace("    MoR", " Mor"));
		
		s8 = "    Hello       World!    ";
		System.out.println("After triming and replacing: " + s8.trim().replace("       ", " "));
		// or
		System.out.println("After triming and replacing: " + s8.trim().replace("       World!", " World!"));
		
		s7 = "         HelloWorld.        ";
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("After triming and replacing: " + s7.trim().replace('.', '!'));
		
		System.out.println("\n------------------------------------------------------------------------");
		String s12 = "Hello! Let's learn together";
		System.out.println("After replacing a word: " + s12.replace("Hello!", "Welcome to Java."));
		
		System.out.println("\n------------------------------------------------------------------------");
		String dateOfToday = "10/01/2023"; // very much used
		System.out.println("After replacing: " + dateOfToday.replace('/', '-'));
		
		s12 = "Hello! Let's learn together";
		// The java string replaceAll() method returns a string replacing all the
		// sequence of characters matching regex and replacement string.
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("After replacing all, the complete String is: " + s12.replaceAll(s12, "Hey Hey Captain!"));
		
		// regular way of concatenation
		System.out.println("\n------------------------------------------------------------------------");
		System.out.println("Hello" + " World!");
		System.out.println(s1 + s12);

		// Concatenation
		// The Java String class concat() method combines specified string at the end of
		// this string. It returns a combined string.
		System.out.println("\n------------------------------------------------------------------------");
		String s13 = "My name is ";
		String s14 = "Tofael";
		System.out.println(s13.concat(s14));
		
		
		// Easy
		// The Java String class contains() method searches the sequence of characters in this string. This is used as method in many places
		System.out.println("\n ------------------------------------------------------------------------");
		String s15 = "How much you know about Java?";
		System.out.println(s15.contains("How much y"));
		System.out.println(s15.contains("How much z"));
		System.out.println(s15.contains("about"));
		System.out.println(s15.contains("hello"));
		System.out.println(s15.contains("Java?"));
		
		// Easy
		// The java string startsWith() method checks if this string starts with given prefix.
		System.out.println("\n ------------------------------------------------------------------------");
		String s16 = "java by Oracle";
		System.out.println(s16.startsWith("j"));
		System.out.println(s16.startsWith("J")); // Case sensitive
		System.out.println(s16.startsWith("java"));
		System.out.println(s16.startsWith("Nava"));
		
		// The Java String class endsWith() method checks if this string ends with a given suffix.
		System.out.println("\n ------------------------------------------------------------------------");
		System.out.println(s16.endsWith("e"));
		System.out.println(s16.endsWith("E")); 
		System.out.println(s16.endsWith("oraclE"));
		System.out.println(s16.endsWith("Oracle"));
		
		// The Java String class isEmpty() method checks if the input string is empty or not.
		System.out.println("\n ------------------------------------------------------------------------");
		String s17 = "";
		String s18 = " "; // White space, not empty
		String s19 = "Java";
		System.out.println(s17.isEmpty());
		System.out.println(s18.isEmpty());
		System.out.println(s19.isEmpty());
		
		// The java String.valueOf() method converts int type of values into string.
		// how to turn int, float etc. to String
		System.out.println("\n ------------------------------------------------------------------------\n");
		int age4 = 30;
		System.out.println(age4 + 10);
		String s20 = String.valueOf(age4);
		System.out.println(s20);
		System.out.println(s20 + 10);
		
		// compareTo() Compares two strings lexicographically.
		System.out.println("------------------------------------------------------------------------\n");		
		String s21 = "hello";
		String s22 = "meklo";
		String s23 = "hemlo";
		String s24 = "flag";
		String s25 = "hello";
		String s26 = "Hello"; // every character have a value based on ASCII Table, h=104, H=72
		System.out.println(s21.compareTo(s25)); // 0 because both are equal
		System.out.println(s21.compareTo(s22)); // -5 because "h" is 5 times lower than "m"
		System.out.println(s21.compareTo(s23)); // -1 because "l" is 1 times lower than "m"
		System.out.println(s21.compareTo(s24)); // 2 because "f" is 2 times lower than "h"
		System.out.println(s21.compareTo(s26)); // 32, every character have a value based on ASCII Table, h=104, H=72
		
		// Not Important
		System.out.println("------------------------------------------------------------------------\n");	
		// The String.join() method is a static method in the String class that concatenates one or more strings with a delimiter added between each String. 
		// This method joins the passed string with the delimiter passed to return a single string.
		String delimiter = "-";
        String result = String.join(delimiter, "Espresso", "is", "Good");
        System.out.println(result);
		
        // Array
        System.out.println("\n------------------------------------------------------------------------");
		// same data type or a cluster of data present
		// How to write an Array: first data type, then [], it is called container, the student (OBJECT) is the name of Array, 
		// [5] represent total 5 data is present
		// Array is static [fixed number of data]
		
		String [] student = new String [5];

		student [0] = "Arman";
		student [1] = "Fatema";
		// index 2 is empty, so it will show us null
		student [3] = "Taraque";
		student [4] = "Ummey";
		// student [5] = "Sanjib"; //  java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(student[0]);
		System.out.println(student[1]);
		System.out.println(student[2]);
		System.out.println(student[3]);
		System.out.println(student[4]);
		
		// or we can write this way
		System.out.println("\n------------------------------------------------------------------------");
		String [] studentAugust = new String [] {"Pronoy", "Ruhul", "", "Saiful", "Shabnin", "Tania"};
		System.out.println(studentAugust[0]);
		System.out.println(studentAugust[2]);
		System.out.println(studentAugust[5]);
		System.out.println(studentAugust.length);
		// important interview question: length () vs length
		
		// or	without  new String [] 
		System.out.println("\n------------------------------------------------------------------------");
		String [] studentAug = {"Arman", "Fatema", "Pronoy", "Ruhul", "Saiful", "Shabnin", "Tania", "Taraque", "Ummey"};
		System.out.println(studentAug[1]);
		System.out.println(studentAug[8]);
		System.out.println(studentAug.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// or	without new int [] 
		int [] age = {25, 30, 35, 47, 45, 23, 100, 44, 62, 223, 12, 886};
		System.out.println(age[0]);
		System.out.println(age.length);
		
		System.out.println("\n------------------------------------------------------------------------");
		// char type
		char [] sex = {'M', 'M', 'M', 'F', 'M'};
		System.out.println(sex[3]);
		System.out.println(sex.length);
		
		// How to write an Array: first data type, then []  container, then array name = data inside curly braces, ended up with semicolon
		
		System.out.println("\n------------------------------------------------------------------------");	
		// Tough: 2, will be used for Java coding challenge, very very important
		// in short, split() method ---> convert a String to a String Type Array, comma separated word by word
		// the array of strings computed by splitting this string around matches of the given regular expression
		String str1 = "Mr owl ate my metal worm";
		String [] wordByword = str1.split(" ");
		// System.out.println(WordByWord); // This will not show correct outcome, because "Arrays" class is needed for Array manipulation
		// Arrays is a class, need to import and used to manipulate Array. you can't print Array without the help of Arrays class
		System.out.println(Arrays.toString(wordByword));
		
		System.out.println("\n------------------------------------------------------------------------");	
		// Tough: 3, will be used for Java coding challenge, very very important
		// we use toCharArray() method to create an Array from String [which is char type] 
		// comma separated character By Character
		String str2 = "Mr owl ate my metal worm";	
		char [] characterByCharacter = str2.toCharArray();
		// System.out.println(charcterByCharacter); // This will not show correct outcome, because "Arrays" class is needed for Array manipulation
		// Arrays is a class, need to import and used to manipulate Array. you can't print Array without the help of Arrays class
		System.out.println(Arrays.toString(characterByCharacter));
		
		// we should use format()
		
		
		
		
	}

}
