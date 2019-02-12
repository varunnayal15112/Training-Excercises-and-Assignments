package MultiThreadingConcept;/*
    MultiThreading in JAVA
    -> Concurrent Execution
    -> Maximum Utilization of the CPU
    -> Can be implemented by 2 ways :
        - Extending the Thread Class
        - Implementing  the runnable interface
    -> Extending the Thread Class : Object is created for the class which inherits the Thread class and invoke the start() method that automatically invoke overridden run() method
    -> Implementing the runnable interface : Object is created for the Thread class because here we are only defining the run() method so we have to use object of Thread class to invoke start() method that invoke overridden run() method

    Below Implementation is through Extending the Thread Class
 */



import java.util.Scanner;

class MultiThread extends Thread {
    public void run() {
        try {
            /*
            Thread.currentThread().getId(); -> getting ID of the running Thread
            Thread.currentThread().getName(); -> getting NAME of the running Thread
            */
            System.out.println("Thread " + Thread.currentThread().getId() + " is running ... ");
        }
        catch (Exception e) {
            System.out.println("Exception is caught !");
        }
    }
}
public class MultiThreadingSample {
    public static void main(String[] args) {
        int numberOfThreads;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of threads : ");
        numberOfThreads = scan.nextInt();
        for(int i=0;i<numberOfThreads;i++) {
            MultiThread object = new MultiThread();
            object.start();
        }
    }
}

