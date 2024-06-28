import java.util.*;

public class Main {

    public static void main(String[] args) {
        int headCnt = 0;
        int tailCnt = 0;

        Random random = new Random();

        Scanner sn = new Scanner(System.in);

        System.out.println("Who are you?");
        String name = sn.next();
        System.out.println("Hello, " + name + "!");

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
        if (headCnt > tailCnt){
          System.out.println(name + " won!");
        } else {
          System.out.println(name + " lost...");
        }
    }
}
