# Exception

### Types of Exception

- Checked Exception
- Unchecked Exception

## Checked Exceptipn

Checked by the compiler at compile time.

Failure to implement exception handling code for checked exceptions is, therefore a compilation error.

Examples:

- File Operations

## Unchecked Exception

Can occcur at runtime but doesn't force you to handle them by the compile. This however may be a good idea. 

Example: dividing my zero - IllegalArugmentException

## The Call Stack

Stack of methods that have been called at any point in a program.

If the methods haven't returned, but have called another stack, they are all part of the call stack.

## Try and Catch
```java
try {

} catch (Exception e) {

}
```

### Finally Block

```java
try {
        
} catch(Exception e) {

} finally {

}
```

## Flow of Exception with exceptions

If no exception occurs, it will execute in the try block.

### Resource Leak

Objects need to be closed, especially if an exception occurs: BufferedReader needs to be closed if no file is found.