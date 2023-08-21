import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(8,9,10,20,25,30,45);

        List<Integer> numsFiltered = nums.stream().filter(num -> num > 20).toList();

        numsFiltered.forEach(System.out::println);
    }
}
