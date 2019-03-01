# Access

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
