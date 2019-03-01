# Packages

## Declaration

Without package declaration, a java file will compile into a `.class` file in the same folder. This is poor file management....

## Compiling .java files

### Compiling all .java  files in the same file

`*` is referred to as the wildcard. This means all files when compiling files in Bash.

```
$ javac *.java
```

### Compiling .java files in different folders

We can compile in different folders:

```
$ javac java/code/assignment1/assignment1.java
```

## Packages

Java classes (and other types) are generally organised into packages.

`java.lang` is imported by default.

## Namespaces

Packages create namespaces.

These are groupings of names. Classes in the same package must have names that are unique within the package.
Classes in different packages can have names that are the same as names in another package.

The package name NEEDS to be unique, therefore it doesn't clash with other packages.

## Importing

`com.site.*` will get all the classes in that package.

However,  you won't get the classes from packages further down the hierarchy.

You would also have to do `com.sites.lower.*` to get the classes from the lower package. 

This isn't the same as inheritance.

## Physical Organisation

Package names should have the same name as the folders they're in. Replace the `.` with `/` to get the path of the package.

Source files can be stored in a folder called src.

We can call the folder structure `classes`, mirroring the package structure.

## Compiling with packages

```
$ javac -d classes src/com/user/project/*.java
```
`-d` tells the compiler that the 'root' folder for the classes is 'classes'. The class files will be placed in a folder structure reflecting the package structure.

The folder specified with the `-d` option must already exist.

## Classpath

We set the classpath with the `-cp` option of `javac`.

```
$ javac -d classes -cp classes src/com/user/project/Project.java
```

We need to do the same for running it:

```
$ java -cp classes com.user.project.Projects
```