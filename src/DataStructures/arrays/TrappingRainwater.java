package DataStructures.arrays;

import java.util.List;

public class TrappingRainwater {

    public static void main(String[] args) {

        List<Integer> myList = List.of(0,1,0,2);

        Integer totalWater = 0;


        for (int i = 0; i< myList.size(); i++) {
            Integer currentValue = myList.get(i);
            Integer listSize = myList.size();
            Integer left = i;
            Integer right = i;
            Integer maxL = 0;
            Integer maxR = 0;

            while (left >= 0) {
                Integer currentValueLeft = myList.get(left);
                maxL = Math.max(maxL, currentValueLeft);
                left--;
            }
            while (right < listSize) {
                Integer currentValueRight = myList.get(right);
                maxR = Math.max(maxR, currentValueRight);
                right++;
            }

            Integer currentWater = Math.min(maxL, maxR) - currentValue;

            if (currentWater > 0) {
                totalWater += currentWater;
            }
        }

        System.out.println(totalWater);
    }
}
