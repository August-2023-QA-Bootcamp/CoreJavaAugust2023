package lec10_03_java_basic_interview_question;

/*
What are Java Reserved words?
-- In Java, there are keywords that are reserved for the use of Java functions or other uses that cannot be identifiers like variables, classes and function names. When a reserved word is used as a variable, we will get an error or some other unexpected result. The following are more examples of reserved words.

abstract, if, private, this, double, implements, throw, boolean, else, import, public, throws, break, return, byte, extends, int, short, true, false, case, interface, static, try, catch, final, long, void.

Can you call a non-static variable or method inside the main method (or inside static method)? *******
-- a non-static variable (or non-static method) can't be called inside a main method (main method is a static method).
-- solved by 2 way 
i) By making the variables static outside the main method
ii) Or by moving (initialized) the variables inside the main method with default access modifier and without static keyword

Can you call a method inside the main method without creating an object? ******
– Yes, if the method is static, we can call it inside the main method without creating an object.

Then the question is HOW?
– ANSWER from Can you call a non-static variable or method inside the main method? 

How to call a Variable in the main method?
– First make it static. Inside the main method, we don't need to put it inside double quotation or single quotation like String, Just call the variables by it's name, inside sysout to see the initialized value of the variable.

Can we call multiple variables inside one sysout by + symbol and see the outcome?
-- Yes, but first follow the above protocol.

Can we call multiple variables and String inside one sysout by + symbol and see the outcome?
-- Yes, but first follow the above protocol.


//If you know below shortcut, you can move smartly in the industry



How to see the font bigger? how to smaller (temporarily)
-- Command/control +
-- Command/control -

How to Enable Tasks in Eclipse IDE?
-- It is used to find out what kind of work is left behind and needs attention.
To see - go to --> Window (eclipse header) -- Show View -- Tasks
We have to Use 
//TODO ----------- write what need to do in future, or any important instruction to follow in future -------

How to remove some part of code or a method from SOMEwhere to other places?
-- Select that part, then alt/option + up/down arrow sign 

How to turn code from lowercase to uppercase [better to use in string]?
-- Select, then shift + Command/control + x
-- Select, then shift + Command/control +  y (to turn it back where it was)

How to turn code from uppercase to lowercase [better to use in string]?
-- Select, then shift + Command/control + y
-- Select, then shift + Command/control +  x (to turn it back where it was)

How to move the cursor to a specific line?
-- Command/Control + L ----> Enter Line Number ---> Go to Line

How to use “toggle bread crumbs”? 
-- find the symbol (small c) and click it from the header. This helps to navigate faster without moving to Package explorer

Some info:
Parameter = Declaration, we do not pass value
Argument = Initialization, we put the value

Access Modifier - public , protected, private, default
Non-Access Modifier - static, void, abstract, synchronized

Object class - is the base (parent) class of all class, generally


*/

public class Info_java_basic {

	

}
