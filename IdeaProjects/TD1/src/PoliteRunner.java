public class PoliteRunner extends Thread {
    private int tick = 1;
    private int num;
    private boolean available = false;

    public PoliteRunner(int num) {
        this.num = num;
    }


    public void run() {
        while (tick < 400000 ) {
            tick++;
            if ((tick % 50000) == 0) {
                System.out.println("Thread #" + num + ", tick = " + tick);
                this.yield();
            }
        }
    }
}


