import java.util.LinkedList;
import java.util.Scanner;

public class Stringtimkiem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String :");
        String string = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            char a = string.charAt(i);
            list.add(a);
            for (int j = i+1; j < string.length(); j++) {
                if (string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }
        for (Character i:max) {
            System.out.println(i);
        }
    }
}
