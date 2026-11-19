public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String s : args) {
            if (s.length() > 0) {
                char c = s.charAt(0);
                if (c % 5 == 0) {
                    System.out.println(c);
                }
            }
        }
    }
}
