package threads;

public class Threads {
    /* DESCRIPTION
    	thread =	A thread of execution in a program (kind of like a virtual CPU)
    				The JVM allows an application to have multiple threads running concurrently
    				Each thread can execute parts of you code in parallel with the main thread
    				Each thread has a priority.
    				Threads with higher priority are executed in preference compared to threads with a lower priority

    			    The Java Virtual Machine continues to execute threads until either of the following occurs
    					1. The exit method of class Runtime has been called
    					2. All user threads have died

    				When a JVM starts up, there is a thread which calls the main method
    				This thread is called “main”

    				Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
				JVM terminates itself when all user threads (non-daemon threads) finish their execution

        multithreading = Process of executing multiple threads simultaneously
                         Helps maximum utilization of CPU
                         Threads are independent, they don't affect the execution of
                         An exception in one thread will not interrupt other threads
                         useful for serving multiple clients, games, or other mutually independent tasks

    */

    /* METHODS
    .activeCount()
    .currentThread().getName()
    .currentThread().getPriority()          //5=default     inherits priority from parent thread ex. main
    .currentThread().setName("name")
    .currentThread().setPriority(1-10)
    .currentThread().isAlive()
    .sleep(milliseconds)
    .isDaemon()
    .setDaemon("true/false")
    .join(milliseconds)
     */

    public static void main(String[] args) {    //a thread calls this method
        System.out.println(Thread.activeCount());   //how many threads are running
        System.out.println(Thread.currentThread().getName());   //get current Thread name
        System.out.println(Thread.currentThread().getPriority());   //get current Thread priority (1-10)
    }
}
