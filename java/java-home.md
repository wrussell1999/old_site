# How to Java for n00bs
### Programming In Java: University of Birmingham 
How to Java for n00bs: Programming In Java at the University of Birmingham

[Home](../index.md)

# Index:

1. [Methods](docs/Methods.md)
2. [Access Levels](docs/Access.md)
2. [Packages](docs/Packages.md)
3. [Object Orientation](docs/ObjectOrientation.md)
    - [Composition](docs/Composition.md)
    - [Inheritance](docs/Inheritance.md)
    - [Abstract](docs/Abstract.md)  
4. [Exceptions](docs/Exception.md)    
5. [Design](docs/Design.md)
6. [Style](docs/Style.md)
7. [Concurrency](docs/Concurrency.md)
8. [Networks](docs/Networks.md)

# Fundamentals:

## `public, private and protected`
What do they mean?
These are important when controlling what your program can touch and what it can't. 

### `public`
Accessible to all classes.

### `private`
Not accessible outside of the class at all.

### `protected`
Accessible:
- Inside the class
- Subclasses of the class
- Classes in the same package

_Not visible outside of the package_

## `static`

Variables or methods belongs to a class.

They do not belong to any object members.

Do not access them through an object - access them via the class

```java
className.memberName;
className.methodName();
```

# Javac

## Quick Javac key terms

`-d` means destination: where the class files are going

`-cp` means class path: where the classes should be found

### Package

Here's a tree of the package I will be using:

```
.
|-- src
|   |-- com
|       |-- will_russell
|-- classes
    |-- com
        |-- will_russell
```
## How to compile basic programs in a terminal


    $ javac -d <where you want the .class files to go> -cp <root of package where the java files are (src)> <location of java file>


Example:

    $ javac -d classes -cp src src/com/will_russell/Example.java

## How to run basic programs in a terminal

    $ java -cp <where the .class files are> package.java_file.java

Example:

	$ java -cp classes com.will_russell.Example.java

# Try this!

You can try the examples yourself and change them about.

## Cloning the repository

Clone the repository:
        
    $ git clone https://github.com/wrussell1999/how-to-java-uob.git

Navigate to the directory:

    $ cd how-to-java-uob

## Running the examples

To compile:

    $ javac -d classes -cp src src/com/will_russell/how_to_java_uob/*

You can also just compile individual files, rather than all of them at once.

To run:

    $ java -cp classes com.will_russell/how_to_java_uob.<path to the file you want to run>