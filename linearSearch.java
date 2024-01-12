import java.util.*;

public class linearSearch {
    public static int linearSearchx(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return item;
            }
        }

        return -1;
    }

    public static OptionalInt linearSearchy(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearchx(arr, 1));
        System.out.println(linearSearchx(arr, 8));

        linearSearchy(arr,1).ifPresent(System.out::println);
        linearSearchy(arr, 8).ifPresent(System.out::println);
    }
}
