package lec03_java_variables;

/*
 What is Java?

-- Java is an object-oriented programming language.

 

What is a class in Java?

-- Class is a blueprint from which -- individual objects are created.

 

What is an object in java?

-- Object is an instance (illustration) of the class and Object is the physical reality.

 

What does a class body contain?

-- class body contain:

-- i) Variable --- Declared and/or Initialize

-- ii) Constructor  --- Declared and/or Initialize

-- iii) Method  --- (not declared) Implemented and/or Initialize *** interview question

 

What is a Variable?

-- A variable is a container that holds values that are used in a Java program. 

-- Every variable must be declared/initialized to use as one data type. 

-- Variable is also called field

-- All the variables name start with a lowercase

-- Variable follow Camel Case and snake case feature

 

Describe the classification of variables? *****

-- Class Variable 2 type:

i) Primitive data type variable- eight types - byte, short, int, long, float, double, char and boolean.

ii) Reference data type variable --- 

            MyInfo myInfo = new MyInfo();

            myInfo is called reference type variable, it is mostly called object

 

Describe all primitive type data?

 

byte = –128 (2^7) to 127 (2^7-1)  //because of zero, zero is counted on the plus side. (-128 to +127)

 

short = –32,768 to 32,767   (32,768 = 256byte)

 

int (integer) = –2,147,483,648 to 2,147,483, 647     [mostly used]

 

long = –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807     [highest range, we never used] [we have to use l (lower case L) at the end]

 

float = decimal till 6 to 7 digit [example: 3.1415927f]   [we have to use f at the end]

 

double = decimal till 15 to 16 digit [example: 3.1415927410125732] 

 

char = ‘A’      

         

boolean = true or false

 

String = “To-fael483” [V V Imp interview question: Not a pure primitive type]

 

 

What are the most commonly used variables in the course?

-- String, int, char, boolean, double.

 

What does it mean by -- a variable declared?

-- it means we did not assign any value for variables.

 

What does it mean by -- a variable initialized?

-- it means we assign value for variables.

 

What is the Info about String type variables?

-- String type variable is initialized inside the double quotation.

-- By default, the value of String is null. (important interview question)

-- String itself is a class, represents for String type variable here

-- String is not a pure primitive data type, important interview question

 

What is the Info about int (called Integer) type variables?

-- int type variable is initialized without any quotation

-- By default, the value of int is 0. (important interview question)

 

What is the Info about char type variables?

-- char type variable is initialized inside the single quotation and represented by uppercase single character/letter

 

What is the Info about boolean-type variables?

-- Boolean type variable is initialized without any quotation, represented by true or false.

-- By default, the value of Boolean is false. (important interview question)

 

 

"" -- what is it called?

--  empty/null String

 

Is Java Strongly Typed Language?

-- Yes, Java is a strongly typed language. Reason: Each and every variable must have a declared type. Primitive (int, String, char, boolean, double, short, long, float) and reference type variable.   

 

What is an object in java?

-- Object is an instance (illustration) of the class and Object is the physical reality.

 

Explain MyInfo myInfo = new MyInfo(); ******

-- MyInfo is a Class. myInfo is an object (most of the places, it is called object)

-- myInfo is also called a reference variable

-- object always starts with lowercase. = is equal operator or assign operator. 

-- new is a keyword. MyInfo() is a newly created Class name 'MyInfo'

-- In Summary, an object is created (myInfo) from MyInfo class which is a new MyInfo type.

 

What does the “new” keyword do in Java? *****

-- The Java new keyword is used to create an instance of the class. In other words, it instantiates a class by allocating memory for a new object and returning a reference to that memory. We can also use the new keyword to create the array object.

Syntax: Car car = new Car();
Points to remember
It is used to create the object.
It allocates the memory at runtime.
All objects occupy memory in the heap area.
It invokes the object constructor.
It requires a single, postfix argument to call the constructor
To learn more: Java New Keyword - Javatpoint

 

 What does it mean by A class is instantiated? ****

 -- When an object is created from the class, the action is called instantiation. Then we say the class is instantiated

 

 What is the Info about byte-type variables? **

-- byte type variable start with lowercase, byte type variable doesn't have any quotation

-- Any value between –128 (2^7) to +127 (2^7-1) is byte type

-- because of zero, zero is counted on the plus side. (-128 to +127) 

-- solid number, no decimal.

 

What is the Info about short type variables?

-- short type variable start with lowercase, short type variable doesn't have any quotation

-- Any value between –256 byte to +256 byte is short type (–32,768 to 32,767)

-- because of zero, zero is counted on the plus side.

-- solid number, no decimal.

 

What is the Info about int (called Integer) type variables?

-- int type variable start with lowercase, int type variable doesn't have any quotation

-- By default, the value of int is zero. (important interview question)

-- solid number, no decimal.

 

What is the Info about long type variables?

-- long type variable start with lowercase, long type variable doesn't have any quotation

-- solid number, no decimal.

-- have to use l at the end.

 

What is the Info about float type variables?

-- float type variable start with lowercase, float type variable doesn't have any quotation

-- not solid numbers, decimal till 6 to 7 digits.

-- have to use f at the end.

 

What is the Info about double type variables?

-- double type variable start with lowercase, double type variable doesn't have any quotation

-- not solid numbers, decimal till 15 to 16 digits.

 

What is the difference between float and double in details?

 -- Though both float and double data type are used to represent floating point numbers in Java, a double data type is more precise than float. A double variable can provide precision up to 15 to 16 decimal points as compared to float precision of 6 to 7 decimal digits. Another significant difference between float and double is their storage requirement, double is more expensive than float. It takes 8 bytes to store a variable while float just takes 4 bytes. Which means, if memory is constraint then it's better to use float than double. BTW, the double type also has a larger range than float and if your numbers don't fit well in float then you have to use double in Java.
 */

public class InfoJavaVariables {

}
