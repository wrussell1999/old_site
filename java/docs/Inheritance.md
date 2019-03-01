# Inheritance

We can describe an inheritance relationship as:

_"Thing A is a type of Thing B"_

Similar to composition, we use _"is a"_ to describe the relationship.

## Super

We can get stuff from the parent class using `super. `

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

"Not So Loud Noise" would print when a ChildClass object is made.

### @Override

Tells the code you want to override the method, so if it doesn't when you compile it, the compiler will let you know it's broken somewhere.
```java
@Override
public void doStuff() {
    System.out.println("Stuff");
}
```