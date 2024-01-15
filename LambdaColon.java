import java.util.function.Function;
import java.util.function.BiFunction;

import java.util.function.Supplier;

public class LambdaColon {
    public class StringUtils {
        public static String convertToUpperCase(String str) {
            return str.toUpperCase();
        }
    }
    
    public static void main(String[] args) {
        Function<String, String> toUpperCase = StringUtils::convertToUpperCase;
        String result = toUpperCase.apply("hello");
        System.out.println(result); // HELLO

        Function<String, Integer> stringLength = String::length; //with an instance method of an arbitrary object of a particular type
        int length = stringLength.apply("hello");
        System.out.println("Length: " + length); //  Length: 5

        Supplier<StringBuilder> stringBuilderSupplier = StringBuilder::new;
        StringBuilder sb = stringBuilderSupplier.get();
        sb.append("Munirat");
        System.out.println(result + " " + sb.toString()); 
    }
}
