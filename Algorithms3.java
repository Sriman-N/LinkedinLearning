public class Algorithms3 {
    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",","");
    }

    public static void main(String[] args) {
        System.out.println(normalizeString("     Hello There, SRIMAN   "));
    }
}
