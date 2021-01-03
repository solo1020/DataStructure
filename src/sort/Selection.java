package sort;

/**
 * @ClassName Selection
 * @description:
 *
 * 选择排序时间复杂度分析：
 * 外层是循环数据量或者循环轮数 也就是 n
 * 内层是比较，关键在于，内层循环只进行赋值，比冒泡排序的交换少了一步 也趋近于n
 * 然后交换次数为 元素个数
 * 容易看出时间复杂度也是O(n^2)
 *
 * @author: isquz
 * @time: 2021/1/4 0:30
 */
public class Selection {

    public static void sort(Comparable[] a){
        // 记录每轮比较的最小值所在索引
        int min = 0;
        for(int i = 0; i < a.length - 1; i++){
            min = i;
            for(int j = i+1; j< a.length; j++){
                if(greater(a[min], a[j])){
                    min = j;
                }
            }
            // 交换min 与 i
            exchange(a,i,min);
        }

    }

    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w) > 0;
    }

    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
