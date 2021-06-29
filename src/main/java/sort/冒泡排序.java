package sort;

import java.util.Arrays;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/16 10:18
 */
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a = {10,20,15,30,9,28,38};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
    public static int[] bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
}
