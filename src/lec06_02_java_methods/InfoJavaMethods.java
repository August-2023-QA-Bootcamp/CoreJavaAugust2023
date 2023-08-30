package lec06_02_java_methods;

/*
What are the features of the method?
-- method name is always starts with lowercase
-- class doesn't have a parentheses, but the method have
-- when {curly braces} is present, then we can say, the method is implemented
-- method can not be declared (only implemented) like variables or constructor inside a class.
-- method name can be the same name as Class name, but must be in lower case. (important interview question)
-- method names are usually verbs or verb phrase	

What is Method in Java?
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use parameterized methods? To reuse code: define the code once, and use it many times.
A method must be implemented within a class. It is defined with the name of the method, followed by parentheses ().
To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
A method can also be called multiple times if it is parameterized.
Information can be passed to methods as parameters. Parameters act like variables inside the method.
Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.
When initialized, arguments are passed to the method
You can have as many parameters as you like. But Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.

Do we need to use the 'this' keyword always in a parameterized method?
-- If global and local variables are not the same, we must use this keyword in a parameterized method to make a relation between global and local variables. otherwise not.

How can we convert a float or double to an int in Java? Give an example.
-- By casting (because byte, short, int, long, float and double are number type data). example below:

public int subtraction(int c, double d) {
		int total2 = c-(int)d; // here casting is done to d
		System.out.println("Subtraction of c and d is: "+total2);
		return total2;
}
	
public int multiplication(int e, float f) {
		int total3 = e*(int)f; // here casting is done to f
		System.out.println("Multiplication of e and f is: "+total3);
		return total3;
}

How can you change a String value to int? ********
-- Integer.parseInt(v)

How can you change an int value to String?
-- String.valueOf(v)

How can you change a String value to double?
-- Double.parseDouble(v)

Give an example of a variable initialized where the default type of access modifier is used.
-- int age = 30;
*/

public class InfoJavaMethods {

}
