# Employee-Salary-Inheritance-Example-Java


## Result

<img width="964" alt="employee salary Inheritance example" src="https://github.com/jaimehernan95/Employee-Salary-Inheritance-Example-Java/blob/master/images/employee.png">


 **hackerrank website provides concepts about _Inheritance,  Subclass and Subclass Constructors_**

###  Inheritance

This allows you to establish a hierarchy for your classes. A class that inherits from some other class (referred to as a superclass) is called a subclass. While a subclass inherits methods and behaviors from a superclass, it can also declare new fields and methods (as well as override superclass methods).


###  Subclass
A subclass is defined with the extends keyword. For example, the syntax ClassB extends ClassA establishes ClassB as a subclass of of ClassA. Java only supports single inheritance, meaning a subclass cannot extend more than one superclass.
Synonymous terms: derived class, extended class, child class.


### Subclass Constructors
Because a constructor initializes an instance of a class, they are never inherited; however, the subclass must call a superclass constructor as it is an extension of a superclass object. This can be done in either of the two ways shown below.


***Consider the following class:***

class MySuperclass{
    // superclass instance variable:
    String myString;
    
    // superclass default (empty) constructor:
    MySuperclass(){} 
    
    // superclass parameterized constructor:
    MySuperclass(String myString){ 
        // initialize instance variable
        this.myString = myString; 
    }
}
1) The subclass makes an explicit call to the superclass' parameterized constructor (i.e.: it calls super(...);):

class MySubclass extends MySuperclass{
    // subclass constructor:
    MySubclass(String myString){ 
        // explicit call to superclass constructor:
        super(myString); 
    }
}
2) The subclass makes an implicit call to the superclass' default constructor (i.e.: a behind-the-scenes call to super(); happens automatically):

class MySubclass extends MySuperclass{
    MySubclass(String myString){
        // behind-the-scenes implicit call to superclass' default constructor happens
        
        // subclass can now initialize superclass instance variable:
        this.myString = myString; 
    }
}

In the second example above, observe that we are initializing a field (myString) that isn't even declared in that class; the reason why this works is because it's inherited from MySuperclass and therefore can be accessed with the this keyword.


Note: If a superclass does not have a default constructor, any subclasses extending it must make an explicit call to one of the superclass' parameterized constructors.


###  Overriding Methods

When overriding a method, it is best practice to precede the method with the @Override annotation. This signifies to both the reader and the compiler that this method is overriding an inherited method, and will also help you check your work by generating a compiler error if no such method exists in the superclass. Method overriding is demonstrated in the example below.

### Conclusion

This function is convenient because I used to build simple servelts websites and re use the same code.

### Source:

**hackerrank website**
https://www.hackerrank.com/challenges/30-inheritance/tutorial, _Accessed on March 30, 2020_
