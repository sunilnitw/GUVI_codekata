
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
        int num = Integer.parseInt(br.readLine());
        if (num == 0) {
            System.out.println("zero");
        } else if (num > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}