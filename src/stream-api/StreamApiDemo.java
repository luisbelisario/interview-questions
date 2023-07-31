import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamApiDemo {
    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1,2,3,4,5,6);

        /*
        Consumer<Integer> functionParameter = new Consumer<Integer>() {
            @Override
            public void accept(Integer value) {
                System.out.println(value);
            }
        };
        */

        // A função forEach recebe um Consumer<T> como descrito no código acima
        // Mas posso reduzir código implementando a mesma solução conforme o código abaixo
        // Expressões lambda só funcionam com FunctionalInterface (interfaces que definem apenas um método)

        values.forEach(value -> System.out.println(value));
    }
}
