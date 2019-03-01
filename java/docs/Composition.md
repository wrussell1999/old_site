# Composition

We put a variable between classes. When our class contains an object of the String class, this is an example of composition.

Relationship between classes referred to as a "has a" relationship.

Private data types are **NOT** examples of composition.

```java
private String name; // Composition
private int age; // Not Composition
private int id; // Not Composition
private ArrayList<Integer> grades; // Composition
```

We can use "has a" to describe the relationship.

## Example

A Car "has a" Tire

```java
public class Car {
    private Color colour;
    private String size;
    private int speed;
    private Tire tire; // Tire object


    // Constructor
    public Car(Color carColour, String carSize, int carSpeed) {
        colour = carColour;
        size = carSize;
        speed = carSpeed;
        tire = new Tire(); // Creates a Tire object
    }
}
```

## Where Composition doesn't work

_"A car has a vehicle"_ or _"A vehicle has a car"_

These statements don't make much sense. 




## Assignment 2 Example

A `BinaryMaximiser` doesn't have a `GAApplication`, but it does have `Individual`s

`BinaryMaximiser` and `GApplication` has a relation through inheritance.

`Individual` has relationships through composition.