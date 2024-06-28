import java.util.*;

public class Main {

    public static void main(String[] args) {
        int headCnt = 0;
        int tailCnt = 0;

        Random random = new Random();

        System.out.println("Tossing a coin...");
        for (int toss = 1; toss <= 3; toss++) {
            int result = random.nextInt(2);
            if (result == 0) {
                System.out.println("Round " + toss + ": Heads");
                headCnt++;
            } else {
                System.out.println("Round " + toss + ": Tails");
                tailCnt++;
            }
        }
        System.out.println("Heads: " + headCnt + ", Tails: " + tailCnt);
    }
}
