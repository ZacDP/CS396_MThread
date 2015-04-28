/**
 * Created by Zac on 4/28/2015.
 */
public class Thread_A extends Thread {
    int k;
    public Thread_A(int k){
        this.k = k;
    }
    public void run() {
        //Run your program here.
    }
}

class ThreadTest {
    //Run all the threads you need here.
    public static void main(String args[]) {
        Thread_A[] p = new Thread_A[10];
        for (int i = 0; i < 3; i++) {
            p[i] = new Thread_A(i);
            p[i].start();
        }
    }
}