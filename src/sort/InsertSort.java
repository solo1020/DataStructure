package sort;

import java.util.Arrays;

/**
 * @ClassName InsertSort
 * @description:
 * @author: isquz
 * @time: 2021/1/4 20:58
 */
public class InsertSort {

    public static void sort(int[] arr){
        int temp = 0;

        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,10,12,1,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
