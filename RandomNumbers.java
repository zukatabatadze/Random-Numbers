import java.util.*;

class RandomNumbers {
    public static void main(String[] args) {
        int b;
        Random r = new Random();

        // random integers in [0, 200]

        for (b = 1; b <= 15; b++) {
            System.out.println(r.nextInt(200));
        }
    }
}