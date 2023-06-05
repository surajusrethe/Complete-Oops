/*Introduction to Process and Thread

In computer programming, a process refers to an executing program. It represents a complete instance of a program running on a computer. A process has its own memory space and system resources allocated to it. It can contain multiple threads that work together to accomplish a task.

On the other hand, a thread is a unit of execution within a process. It is the smallest sequence of programmed instructions that can be managed independently by a scheduler. Threads share the same memory space and system resources within a process, allowing them to communicate and cooperate with each other more efficiently.

Multithreading and Multitasking

Multithreading and multitasking are two concepts related to concurrent execution, but they operate at different levels.

Multitasking refers to the ability of an operating system to run multiple tasks or processes concurrently. The operating system allocates time slices to each task or process, allowing them to execute in an interleaved manner. This gives the illusion of parallel execution, even though the processor can only execute one task at a time. Multitasking enables efficient utilization of system resources and improves overall system performance.

On the other hand, multithreading is a technique used within a single process to achieve concurrent execution by dividing it into smaller units called threads. Threads within a process can execute independently and share the same memory space. Multithreading allows for parallelism within a process and can improve the performance of tasks that involve multiple computations or I/O operations.

Creating Threads in Java

In Java, there are two ways to create and work with threads:*/

***Using the Runnable interface: Implement the Runnable interface in a class and override the run() method to define the body of the thread's execution.


class MyThread implements Runnable {
    public void run() {
        // Define the task to be executed by the thread
    }
}

MyThread myThread = new MyThread();
Thread thread = new Thread(myThread);
thread.start();

//Extending the Thread class: Create a subclass of the Thread class and override the run() method to define the body of the thread's execution.

class MyThread extends Thread {
    public void run() {
        // Define the task to be executed by the thread
    }
}

MyThread myThread = new MyThread();
myThread.start();


//Both approaches allow you to define the logic that will be executed by the thread within the run() method.

//Starting Threads in Java

//To start a thread in Java, you need to call the start() method on the thread object. This method initiates the execution of the thread's run() method in a separate thread of control.

thread.start();

//When the start() method is invoked, the Java Virtual Machine (JVM) calls the thread's run() method in a new thread of execution.


***Life Cyccle of thread:

  +---------------------+
  |      New Thread     |
  +---------------------+
            |
            |
            v
  +---------------------+
  |    Runnable Thread  |
  +---------------------+
            |
            |
            v
  +---------------------+
  |    Running Thread   |
  +---------------------+
            |
            |  (Blocked/Waiting)
            v
  +---------------------+
  | Blocked/Waiting Thread |
  +---------------------+
            |
            |  (Timed Waiting)
            v
  +---------------------+
  | Timed Waiting Thread |
  +---------------------+
            |
            |
            v
  +---------------------+
  |   Terminated Thread |
  +---------------------+


Thread Operations
