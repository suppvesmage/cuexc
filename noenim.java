import java.util.function.Predicate;

public class Example {
    public static Predicate<Integer> isGreaterThan(int value) {
        return num -> num > value;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = isGreaterThan(5);
        System.out.println(predicate.test(10)); // Output: true
        System.out.println(predicate.test(3));  // Output: false
    }
}
