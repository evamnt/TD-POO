public class ThreadTest {
    public static void main(String arg[]){
        MyThread t1,t2;
        t1 = new MyThread();
        t2 = new MyThread();
        t1.start();
        t2.start();
    }

}
