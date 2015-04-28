/**
 * Created by Zac on 4/28/2015.
 */
public class Thread_A extends Thread {
    int name;
    public Thread_A(int name){
        this.name = name;
    }
    public void run() {
        for(int i=1;i<=5;i++) System.out.printf("\t From Thread %d: i = %d\n", name, i);
        System.out.println("Exit from "+name);
    }
}

class ThreadTest {
    public static void main(String args[]) {
        Thread_A[] p = new Thread_A[10];
        for (int i = 0; i < 3; i++) {
            p[i] = new Thread_A(i);
            p[i].start();
        }
    }
}