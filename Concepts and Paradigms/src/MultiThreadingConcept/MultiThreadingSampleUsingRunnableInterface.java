package MultiThreadingConcept;
/*
    MultiThreadingConcept.MultiThreading in JAVA
    -> Concurrent Execution
    -> Maximum Utilization of the CPU
    -> Can be implemented by 2 ways :
        - Extending the Thread Class
        - Implementing  the runnable interface
    -> Extending the Thread Class : Object is created for the class which inherits the Thread class and invoke the start() method that automatically invoke overridden run() method
    -> Implementing the runnable interface : Object is created for the Thread class because here we are only defining the run() method so we have to use object of Thread class to invoke start() method that invoke overridden run() method

    Below Implementation is through Implementing the Runnable interface
 */

import java.util.Scanner;

class MultiThreading implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running ...");
        }
        catch (Exception e) {
            System.out.println("Exception is caught !");
        }
    }
}
public class MultiThreadingSampleUsingRunnableInterface {
    public static void main(String[] args) {
        int numberOfThreads;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Threads : ");
        numberOfThreads = scan.nextInt();
        for(int i=0;i<numberOfThreads;i++) {
            Thread object = new Thread(new MultiThreading());
            object.start();
        }
    }
}
