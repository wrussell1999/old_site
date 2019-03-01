# Methods


A set of instructions in a block. This block is run every time it is called by its name. Methods can take an input, called a **parameter**. These can be of different types.

There are 2 types of methods:
- Functions
- Procedures

### Function

These methods return a value when they're called. This can either return an object or a primative type. 

### Procedures

These methods don't return anything and are type `void`. 

Effectively, it's just a set of instructions. This is helpful when you want to perform them multiple times or want to make your code more readable.

## Method Overloading

You can have several methods with the same name, if they have different parameters. Depending on what parameters the method is called with will depend on what method is called.

## Abstract Methods

These are methods which mmay sit in the super class. They don't actually have a block of code, but a rather a template. With this, sub classes override this abstract method with their own version of it, suitible for that classes purpose. 

A good example would be having `Shape` as a super class, and more specific shapes as sub classes, e.g. `Circle` and `Sqaure`. You may have a method in Shape for calculating the area, but this is different for each shape. We don't want the user to calculate the area for a "Shape" as it's too vague. Abstract methods can prevent the user from doing thi, but still getting the area of correct shape.