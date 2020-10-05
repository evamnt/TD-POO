import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

public class AnnoyingBeep {
    Toolkit toolkit;
    Timer timer;

    public AnnoyingBeep() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        RemindTask r = new RemindTask();
        timer.scheduleAtFixedRate(r,
                5*1000,
                1*1000);
        if (r.scheduledExecutionTime() - System.currentTimeMillis() > 5) {
            timer.cancel();
        }
    }
    class RemindTask extends TimerTask {
        int numWarningBeeps = 3;

        public void run () {
                if (numWarningBeeps > 0){
                    toolkit.beep();
                    System.out.println("Beep!");
                    numWarningBeeps--;
                }
                else {
                    toolkit.beep();
                    System.out.println("Time's up!");
                    System.exit(0);
                }
            }

        }

    public static void main (String args[]){
        System.out.println("About to schedule task.");
        new AnnoyingBeep();
        System.out.println("Task scheduled.");
    }
}

