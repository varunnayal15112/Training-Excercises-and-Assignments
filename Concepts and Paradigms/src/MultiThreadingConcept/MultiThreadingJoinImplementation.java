package MultiThreadingConcept;

class MultiThreadingJoinSample extends Thread {
    static String[] str = {"Hashmap","Varun","Nayal"};
    static int index = 0;
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.print(str[index] + " ");
        }
        System.out.println();
        index += 1;
    }
}
public class MultiThreadingJoinImplementation {
    public static void main(String[] args) throws InterruptedException {
        MultiThreadingJoinSample T1 = new MultiThreadingJoinSample();
        MultiThreadingJoinSample T2 = new MultiThreadingJoinSample();
        MultiThreadingJoinSample T3 = new MultiThreadingJoinSample();
        T1.start();
        T1.join();
        T2.start();
        T2.join();
        T3.start();
        T3.join();
    }
}
