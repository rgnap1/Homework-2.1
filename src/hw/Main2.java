package hw;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args){

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer < 0){
                    return false;
                }
                return true;
            }
        };

        Predicate<Integer> predicate1 = x -> x > 0;

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello" + s + " !");
            }
        };

        Consumer<String> consumer1 = s -> System.out.println("Hello" + s + " !");

        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };

        Function<Double, Long> function1 = x -> Math.round(x);


        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int)(Math.random() * 100);
            }
        };

        Supplier<Integer> supplier1 = () -> (int) (Math.random() * 100);


    }
    public static <T, U> Function <T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse
    ){
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }
}
