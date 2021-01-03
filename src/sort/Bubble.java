package sort;

/**
 * @ClassName Bubble
 * @description: 冒泡排序抽象模拟
 *
 * 冒泡排序时间复杂度分析：
 * 外层循环是比较的元素的个数 从数组长度一直变到0 在n 也就是n次
 * 内层循环对每个子序列进行交换 也就是每两两交换，在最坏情况，即 数组长度n - 1 次
 * 其中的 交换代码的复杂度 可以看作1
 * 所以总复杂度为 O(n^2)
 *
 * @author: isquz
 * @time: 2021/1/3 22:48
 */
public class Bubble {

    /**
     * @description: 对数组a 中元素进行冒泡排序
     * @param: a
     * @return: void
     * @author: isquz
     * @date: 2021/1/3 23:14
     */
    public static void sort(Comparable[] a){
        for(int i = a.length - 1; i > 0; i--){
            for(int j = 0; j<i; j++){   // 从末尾开始计数的好处在于 可以确保不会出现索引越界
                if(greater(a[j], a[j+1])){
                    exchange(a, j, j+1);
                }
            }
        }
    }

    /**
     * @description: 比较元素v 是否大于w
     * @param: v
     * @param: w
     * @return: boolean
     * @author: isquz
     * @date: 2021/1/3 23:16
     */
    private static boolean greater(Comparable v, Comparable w){             return v.compareTo(w) > 0;
    }

    /**
     * @description: 数组元素交换位置
     * @param: a
     * @param: i
     * @param: j
     * @return: void
     * @author: isquz
     * @date: 2021/1/3 23:17
     */
    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
