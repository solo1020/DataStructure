package sort;

import java.util.Arrays;

/**
 * @ClassName InsertionTest
 * @description:
 * @author: isquz
 * @time: 2021/1/4 21:38
 */
public class InsertionTest {
    public static void main(String[] args) {
        Integer[] a = {4,3,2,10,12,1,5,6};
        Insertion.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
