
/**
 * positive_negative
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class positive_negative {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        try {
            int num = Integer.parseInt(str);
            if (num == 0) {
                System.out.println("Zero");
            } else if (num > 0) {
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }

        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}