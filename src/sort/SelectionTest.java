package sort;

import java.util.Arrays;

/**
 * @ClassName SelectionTest
 * @description:
 * @author: isquz
 * @time: 2021/1/4 0:44
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = {4,6,8,7,9,2,10,1};
        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
