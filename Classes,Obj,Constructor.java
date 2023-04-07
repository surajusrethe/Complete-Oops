- In java primitive data types are not implemented as an object,
 objects are stored in the heap memory hence primitive data types are not objects so they are stored in these tech memory

- Java is Statically typed language (Python vice versa) means that the type of a variable is checked at compile time. 
  Once a variable is declared with a particular data type, it cannot be assigned a value of a different data type.
  This helps to catch type errors at compile time and improve the reliability of the code.
  Example:
  myVariable = "Hello";
  myVariable = "Hello"; // this will give error;

  Classes:
  
  - Classes are group of properties(attributes) and methods(functions),
  - Class are like a blue print.
  - Class is a logical entity means it does not occupy memory, when the object is created than memory is consumed.
  - When you declare value in class like String name; int age; so it has default value as null or 0.
  - If you want you can initialize value of attribute(variable) in class. if not so you can declare it only and can initialize through Object at run time.
  
  Objects:
  
- Objects are the instance of class.
- It is not a physical entity in the sense that it does not exist in memory until it is created at runtime.
- When you create an object, memory is allocated to store its state (i.e., the values of its member variables) and behavior (i.e., the methods that it can perform).
- Each object that is created from the same class has its own unique state and behavior.
- objects are dynamically allocated memory at runtime, and they exist in memory until they are explicitly destroyed by the garbage collector or until the program terminates.
- Objects state and behavior are determined by the class that they are created from.
- Variable inside the objects called instance variable;
- with help of dot(.) we uses or acces the instance vairable inside class.
- variable that actually defines an object called refference variable like String name = "Suraj"; int age = 24; 
- instance variable are inside the class but outside the method.
- new keyword is used to initialize the objests, it Dynamically(means at run time) creats the memory and return refference to it.
- Student student = new Student(); //{left side things done at compiletime right side atruntime}
  compile time    =  run time;
- if you have not initialized the value to the objects by default it will be null for String and 0 for int;



public class Main
{
    public static void main(String[] args)
    {
        Student stu = new Student();

        stu.name = "Sahil";
        stu.age = 28;
        stu.roll_num = 143;
        
        System.out.println(stu.age+ stu.name+stu.roll_num);
        }


    public static class Student
    {
        String name;
        int age;
        int roll_num;
    }
}



Contructors:

now in the avove code example you can see, we are creating new aboject and for every objet we are writing   
       
       stu.name = "Sahil";
        stu.age = 28;
        stu.roll_num = 143;
        
if we have to make 100's of object so will be doing this work again and again? No right.
so here the constructors comes into the picture.

- constructors are special kind of method which does not have return type and used to initialise the object of class.
- if you don't create constructor then Java does one for you 
          Student stu = new Student();
  here Student() is the default constructor provided by java.
  




This keyword:

- this. keyword replace the refference variable it self. thi. keyword is used as a refference.
- this. Keyword is also used to call the constructor from another constructor in the same class.


final keyword:

-final keyword prevent your content to be, modified.
- Alwasy initialize the final varial while declaring becasuse you cannot modify it further at all.
- final variable assure immutability only if the reference variable are primitive data type.
  But if the reference variable are not primitive data type then you can make changes in the value but you can not reassign it
  
  Example;
  
 final Student suraj = new Student();
    suraj.name = "Jagdeesh";
    
    
    
    
    
    
