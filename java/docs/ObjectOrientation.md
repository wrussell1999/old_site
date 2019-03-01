# Object Orientation

## Classes

Template or blueprint. 

It just describes what something will contain, what it does and how it does it.

They have data and operations needed for some particular type.

### Advantages

- Code reuse
    - Saves effort on coding
    - Reduce potential errors
    - We can share code across an organisation or group
- Better logical structure
    - Improves the semantics of our program (what things *means*)
- Better 'hiding'
    - Hiding the implementation details of a type in its own class

## Objects

Each object created holds onto its own data independently to the others.

### Creating an object

```java
Object objectName = new Object();
```

## Constructor

Gives birth to an object and does nothing to it afterwards.
```java
public ClassName() {

}
```    


## Super

We can get stuff from the parent class using `super.`

### Parent Class
```java
public class ParentClass {
    void doStuff() {
        System.out.println("hello");
    }
}

```
### Child Class
```java
public class ChildClass extends ParentClass {
    super.doStuff();
}
```
## Overriding

A child class can have the same method as a parent class, and will override it.

### Parent Class
```java
public class ParentClass {
    void makeNoise() {
        System.out.println("Loud Noise");
    }
}
```

### Child Class
```java
public class ChildClass {
    void makeNoise() {
        System.out.printlm("Not So Loud Noise");
    }
}
```

"Not So Loud Noise" would print when a ChildClass object is made and the method `makeNoise()` is called.

### @Override

Tells the code you want to override the method, so if it doesn't when you compile it, the compiler will let you know it's broken somewhere.
```java
@Override
public void doStuff() {
    System.out.println("Stuff");
}
```

## Polymorphism

The behaviour where apparently the same types can do different stuff.... bur what does that mean?

We can refer to an object with a reference to one of its parent types.

```java
Parent name = new Child();
```

You can't rely on inheritance and polymporphism if you use composition.

This works depending on the context of the program.

---

## Encapsulation

This is the concept of hiding data from other classes.

Use getters and setters to access data from an object. 

Attributes are `private` but methods are `public`. Other classes can see the methods for getting and setting data, but they can't access the attributes directly.

## Getters and Setters

### Get

```java
private int age;

public age getAttribute() {
    return age;
}
```

### Set

```java
private int age;

public void setAttribute(int input_age) {
    age = input_age;
}
```
or

```java
public void setAttribute(int age) {
    this.age = age;
}
```

---

## Abstract

Existing in thoughts of as in an idea but not having a physical or concrete existence.

Sometimes we don't want to create an object for a parent class, but we want it to exist as support for sub classes.

**I like to think of it like this:** an abstract class is just a class without a constructor.

```java
public abstract methodName();
```

The program will not compile if you try and create an object with an abstract type.

Just because a class is declared as abstract doesn't mean you can't get it to do stuff:

### Child class
```java
@Override
public data_type methodName() {
    // do stuff 
    return data_type
}
```

### Creating objects 

```java
ParentObject objectName = new ChildObject();
ChildObject objectName = new ChildObject();
```

If a parent method is declared as abstract, then child classes are forced to implement it otherwise they must be abstract themselves.

---

## Interface

An interface to an object is its public methods (and public data, if there is any).
An interface is sich an extreme abstract type, it has no declaration or anything.
```java
public interface ObjectName {
    public void load (String fileName)
}
```

### Implements

You can't extend more than one class, however you can implement multiple interfaces:

```java
public class Name extends OtherClass implements AnotherClass {

}
```

also:

```java
public class Name extends OtherClass implements AnotherClass, YetAnotherClass {

}
```