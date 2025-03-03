package DataStructures.arrays;

import java.util.Arrays;
import java.util.List;

public class ContainerMostWater {

    public static void main(String[] args) {

        int[] myArray = {1,8,6,2,5,4,8,3,7};

        int p1 = 0;
        int p2 = myArray.length-1;
        int maxArea = 0;

        while (p1 < p2) {
            int height = Math.min(myArray[p1], myArray[p2]);
            int width = p2-p1;
            int area = height * width;

            maxArea = Math.max(area, maxArea);

            if (myArray[p1] <= myArray[p2]) {
                p1++;
            } else {
                p2--;
            }
        }

        System.out.println(maxArea);
    }
}
