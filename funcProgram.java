import java.util.function.BiFunction;
import java.util.function.Function;

public class funcProgram {
    public static void main(String[] args) {
        Function<Integer, Integer> multiply = x -> x* x;
            int result = multiply.apply(5);
            System.out.println(result);

        BiFunction<Integer, Integer, Integer> multiply1 = (x,y) -> x *y;
            int result1 = multiply1.apply(2, 5);
            System.out.println(result1);
    }
}
