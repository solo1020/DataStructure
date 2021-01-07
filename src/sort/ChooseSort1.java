package sort;

import java.util.Arrays;

/**
 * @ClassName ChooseSort1
 * @description: 选择排序
 * @author: isquz
 * @time: 2021/1/3 23:41
 */
public class ChooseSort1 {
    /**
     * @description:
     *
     * 这个写法也算选择排序 但是不是很明显
     * 和 冒泡排序的区别在于，冒泡排序是相邻两个比较
     * 选择排序是剩下的所有元素跟第一个元素比较
     *
     * @param: arr
     * @return: void
     * @author: isquz
     * @date: 2021/1/3 23:51
     */
    public static void sort0(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void sort(int[] arr){
        int min = 0;
        int temp = 0;
        for(int n = 0; n < arr.length -1; n++){
            min = n;
            for(int i = n + 1; i < arr.length; i++){
                if(arr[min] > arr[i]){
                    min = i;
                }
            }
            temp = arr[n];
            arr[n] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,8,7,9,2,10,1};
        int[] arr1 = {4,6,8,7,9,2,10,1};
//        sort0(arr);
        System.out.println(Arrays.toString(arr));


//        long start = System.currentTimeMillis();
//        for(int i = 0; i < 5000000; i++){
//            arr = arr1;
//            sort(arr);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("cost time: " + (end -start));

    }
}
