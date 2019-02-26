import utilities.GFG;

public class Main {

    public static void main(String[] args) {
        String str = "a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();

        System.out.println("Input string: " + str);
        GFG.reverse(charArray);
        String revStr = new String(charArray);

        System.out.println("Output string: " + revStr);
    }
}
