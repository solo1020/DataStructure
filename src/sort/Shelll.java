package sort;

/**
 * @ClassName Shelll
 * @description:
 * @author: isquz
 * @time: 2021/1/7 23:09
 */
public class Shelll {

    public static void sort(Comparable[] a){
        int h = 1;
        while (h < a.length/2){
            h = 2 * h + 1;
        }
        while (h >= 1){
            for(int i = h; i < a.length; i++){
                for(int j =i; j>=h;j-=h){

                    if(greater(a[j-h],a[j])){
                        exch(a,j-h, j);
                    }else {
                        break;
                    }
                }
            }

            h = h / 2;
        }

    }

    private static boolean greater(Comparable v, Comparable w){
        return v.compareTo(w)>0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
