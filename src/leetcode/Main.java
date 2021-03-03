package leetcode;

import java.util.Scanner;

/**
 * @ClassName Main
 * @description:
 * @author: isquz
 * @time: 2021/3/3 21:44
 */
public class Main {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);

        System.out.println(delSameChar("azxxzy"));

    }

    // leetcode 1047
    public static String delSameChar(String s){
        StringBuilder tmp = new StringBuilder();
        String newStr = s.substring(1)+" ";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == newStr.charAt(i)){
                i = i + 1;
            }else {
//                System.out.println("before append: " + tmp.toString());
                tmp.append(s.charAt(i));
                if(i == s.length() - 2){
                    tmp.append(s.charAt(i+1));
//                    System.out.println("after append: " + tmp.toString());
                    break;
                }
            }

//            if(s.charAt(i) == s.charAt(i+1)){
//                if(i+1 == s.length() - 2){
//                    tmp.append(s.charAt(i+2));
//                }else {
//                    i = i + 1;
//                }
//            }else {
//                tmp.append(s.charAt(i));
//            }
        }
        System.out.println("now: " + tmp.toString());

        if(includeSameChar(tmp.toString())){
            return delSameChar(tmp.toString());
        }else{
            return tmp.toString();
        }
    }

    public static boolean includeSameChar(String s){
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                return true;
            }
        }
        return false;
    }



}
