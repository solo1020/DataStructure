/**
 * @ClassName BubbleSort
 * @description:
 * @author: isquz
 * @time: 2021/1/3 0:16
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {4,5,6,3,2,1};
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(i + ": " + arr[i]);
        }

    }

    /**
     * @description:
     *
     * 冒泡排序：
     * 每一轮找出 待比较元素组  中的 最大值放到该元素组最末尾
     * 具体实现：
     * 顾名思义，冒泡一样的一个个往上
     * 即 相邻的两个比较，将较大的一个放到后面 一直重复到完成该轮比较
     * 同时，待比较元素组 每轮都在变化
     * 因为 第一轮已经找到了原始数组中的最大值，不需要再进行比较
     * 所以 每一轮的 待比较数组为 0索引 到 (原始数组末尾索引 减 第几轮)
     *
     * @return: void
     * @author: isquz
     * @date: 2021/1/3 0:34
     */
    public static void bubbleSort(int[] arr){
        int temp = 0;
        int n = arr.length - 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                if(arr[j] > arr[j+1]){
                    System.out.println("change " + j + " and " + (j+1) + ": " + arr[j] + " - " + arr[j+1]);
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
}
