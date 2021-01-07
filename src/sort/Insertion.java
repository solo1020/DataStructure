package sort;

/**
 * @ClassName Insertion
 * @description:
 * @author: isquz
 * @time: 2021/1/4 21:26
 */
public class Insertion {

    public static void sort(Comparable[] a){
        for(int i = 1; i < a.length; i++){
            for(int j = i; j > 0; j--){
                // 比较 j 和 j-1 处的索引
                // 如果 j-1 大 则交换数据
                // 如果 j 大 则说明找到了未排序元素a[j]的正确位置 退出循环
                // 关键在于 j-- 的双重效果
                if(greater(a[j-1], a[j])){
                    exchange(a, j-1, j);
                }else {
                    // 一旦找到就跳出 因为前面的数组已经排序了
                    break;
                }


            }
        }

    }

    private static boolean greater(Comparable v, Comparable w){
        return  v.compareTo(w) > 0;
    }

    private static void exchange(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
