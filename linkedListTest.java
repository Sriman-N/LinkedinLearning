import java.util.*;

public class linkedListTest {
    public static void main(String[] args) {
        LinkedList<String> listy = new LinkedList<>();
        listy.add("Sriman");
        listy.add("Sudhir");
        listy.add("Gayatri");
        listy.add("Lakshmi");
        listy.add("Bob");

        System.out.println(listy.contains("Bob"));
        System.out.println(listy.size());
        listy.removeFirst();

        for (String item : listy) {
            System.out.print(item + "->");
        }

        listy.forEach(x -> System.out.print(x + "->"));
    }
}
