# Concurrency
## _WORK IN PROGRESS_

When different tasks are making progress at the same time

The tasks might not be literally executing at the same instant.

### Multi-threading
When an individual application can do more than one thing at a time.

## Parallelism

Refer to the case where tasks are broken down into related sub-tasks which can be performed in parallel.

Advantages:
- 1
- 2
- 3

Concurrency and parallelism are not the same thing.

## Multi-tasking

## Blocking operation

Suspends other operations until another action has been performed.

## Non-blocking operation

Allows other tasks to work.


## Processes

Heavyweight entity. A lot of information is required for a process. Each process will be allocated a stack space, and a lot of other information will be stored.
Once a program is copied into the RAM, it becomes a process. 

Process is allocated an address space in the RAM. 

A single program can have multiple processes to run it.

Sometimes a process will launch another process., e.g. if a web browser loads a video. The video is its own process.

## Slices

## Thread

Light weight.

Separate bit of a program execution within a single process. It's a software construct, however it may be able to run on specific hardware (depending on the system's configuation).


E.g.
- Tab in a browser
- JVM starts a main thread when the main() method is loaded
- GUI involves multiple threads

# Thread Class

You have to start the object else it won't do anything, even if an object has been made.

The thread will quit when the `run()` method finishes.

```java
public class TestThread extends Thread {
    public void run() {
        System.out.println("Test");
    }

    public static void main(String[] args) {
        TestThread testThread = new TestThread()
        testThread.start(); // Nothing will happen until this is called.
    }
}
```

Do not try and call the `run()` method.

### Runnable


```java
public class TestRunnable implements Runnable {
    public void run() {
        System.out.println("This is a thread");
    }

    public static void main(String[] args) {
        Thread tr = new Thread(new TestRunnable());
        tr.start();
    }
}
```

This is preferred because it's more flexible.

## Multiple threads

```java

public class MultipleTheads implements Runnable {
    private int idNumber;

    public static void main(String[] args) {
        new MultipleThreads(1);
        new MultipleThreads(2);
    }

    public MutipleThreads(int id) {
        idNumber = id;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Test");
    }
}
```

Constructor starts the thread

Once we start multiple threads, there is no set order that they will run.

They will be started depending on the system they're started on.

### `join()` method.

Causes current thread to pause and waits until the identified thread has completed its `run()` method

### `sleep()` method

Helps to prevent one thread hogging.

Parameter is miliseconds.
Puts the thread to sleep until the system decides.


## Thread Interference

Threads interacting with each other in ways that cause bugs and other problems.


## Synchronised

We can make methods `synchronised`. These can only be entered by one thread at a time. As a result, the `++` operation can't be interrupted. 

### `++` operation

It's not atomic

Here we have a class with `synchronized` methods.

```java
public class SynchronizeData {
    privata int value;

    public synchronized void set() {
        value++;
    }

    public synchronized int get() {
        return value;
    }
}
```

We create an object of it in the following class:

```java
public class Example extends Thread {

    private SynchronizedData data;

    public static void main(String[] args) {
        SynchronizedData data = new SynchronizedData();
        for (int i = 0; i < 10; i++) {
            new Example(data);
        }
    }

    // Constructor
    public Example(SynchronizedData data) {
        this.data = data;
        this.start();
    }

    @Override
    public void run() {
        data.set();
        System.out.println(this.getName() + ", data: " + data.get());
    }
}

```
This would output the following:

```
Thread-0, data: 1
Thread-1, data: 2
Thread-2, data: 3
Thread-3, data: 4
Thread-4, data: 5
Thread-5, data: 6
Thread-6, data: 7
Thread-7, data: 8
Thread-8, data: 9
Thread-9, data: 10
```