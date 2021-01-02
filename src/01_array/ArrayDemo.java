/**
 * @ClassName ArrayDemo
 * @description:
 *
 * Java内存占用(字节)：
 * byte:1
 * short:2
 * int:4
 * long:8
 * float:4
 * double:8
 * boolean:1
 * char:2
 *
 * 一个对象引用：8
 * 对象本身(除去对象内部存储的信息占用):16 保存对象头信息
 * 内存使用不够8字节 自动填充为8字节
 * 原始数据类型数组:24 (16字节为对象本身开销 + 4字节保存长度 + 4填充字节)
 *
 * @author: isquz
 * @time: 2021/1/2 20:23
 */
public class ArrayDemo {
    public static void main(String[] args) {

    }

    public static int[] reverse1(int[] arr){
        int n = arr.length;
        int temp;
        for(int start = 0, end = n -1; start <= end; start++, end--){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }

    /**
     * @description: 反转数组 简单粗暴
     * @return: int[]
     * @author: isquz
     * @date: 2021/1/2 23:01
     */
    public static int[] revese2(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i= n-1; i >= 0; i--){
            temp[n - 1 - i] = arr[i];
        }
        return temp;
    }
}
