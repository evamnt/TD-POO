import java.util.Scanner;
import java.util.ArrayList;

public class TestThreadMany {
    public static void main(String arg[]) {
        Scanner n = new Scanner(System.in);
        System.out.println("How many threads do you want ?");
        int n_threads = Integer.parseInt(n.nextLine());
        ArrayList<MyThread> myThreads = new ArrayList<>();
        for (int i = 0; i < n_threads; i++) {
            myThreads.add(new MyThread("Thread #" + Integer.toString(i+1)));
            myThreads.get(i).start();
        }

    }
}
