public class MyThread extends Thread {
    public MyThread(String s){
        super(s);
    }
    public void  run() {

        System.out.println("Hi there! I am"+ getName());
    }
}
