package DataStructures.arrays;

import java.util.Arrays;

public class moveZeroes {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println(Arrays.toString(move(nums)));
    }

    public static int[] move(int[] nums) {
        // Aqui temos que fazer uma analogia da quantidade de zero com uma bola de neve
        // A cada novo zero acrescento um a "bola de neve" de zeros
        // Em seguida coloco o valor zero naquela posição e trago o valor que não é zero para a posição i - o tamanho da bola de neve

        int snowBall = 0;

        for (int i = 0; i< nums.length; i++) {
            if (nums[i] == 0) {
                snowBall++;
            } else if (snowBall > 0) {
                // faço else-if pois só deveo entrar nessa condição se já tiver achado pelo menos um valor zero
                // caso contrário não devo fazer movimentação alguma
                int t = nums[i];
                nums[i] = 0;
                nums[i - snowBall] = t;
            }
        }
        return nums;
    }
}
