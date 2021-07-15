
import java.util.*;
public class Alphabet {
public static String compress(String text) {
    String result = "";

    int index = 0;

    while (index < text.length()) {
        char c = text.charAt(index);
        int count = count(text, index);
        if (count == 1)
            result += "" + c;
        else
            result += "" + c + count;
        index += count;
    }

    return result;
}

public static int count(String text, int index) {
    char c = text.charAt(index);
    int i = 1;
    while (index + i < text.length() && text.charAt(index + i) == c)
        i++;
    return i;
} 

public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter string:");
    String test =sc.next();
    System.out.println(compress(test));
}
}
