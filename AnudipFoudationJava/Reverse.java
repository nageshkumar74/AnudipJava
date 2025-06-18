public class Reverse {
    public static void main(String[] args) {
        String str = "Hello";

        int l = str.length();
        String rev = "";
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed: " + rev); // Fixed typo in output message
    }
}

