package sort;

import java.util.Arrays;

/**
 * @ClassName ShellTest
 * @description:
 * @author: isquz
 * @time: 2021/1/8 0:06
 */
public class ShellTest {
    public static void main(String[] args) {
        Integer[] a = {9,1,2,5,7,4,8,6,3,5};
        Shelll.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
