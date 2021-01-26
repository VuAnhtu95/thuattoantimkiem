import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi : ");
        String string = scanner.nextLine();
        int[] ints = new int[1000];
        for (int i = 0; i < string.length(); i++) {
            int hashcode = string.charAt(i);
            ints[hashcode] +=1;
        }
        int max = 0;
        char character = 1000;
        for (int j = 0; j < 1000; j++) {
            if (ints[j]>max){
                max = ints[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
}
