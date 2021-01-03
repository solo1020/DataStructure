package sort;

import java.util.Arrays;

/**
 * @ClassName BubbleTest
 * @description:
 * @author: isquz
 * @time: 2021/1/3 23:30
 */
public class BubbleTest {

    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
