package sort;

import java.util.Arrays;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/16 9:08
 */
public class 快速排序 {

    public static void main(String[] args) {
        int[] a = {10,20,15,30,9,28,38};
        System.out.println(Arrays.toString(a));
        quick_sort(a,0,a.length-1);
        System.out.println("===============");
        System.out.println(Arrays.toString(a));

    }
    public static void quick_sort(int[] arr,int low,int high){
        if(low > high){
            return;
        }
        int i = low;
        int j = high;
        int t ;
        int temp = arr[low];

        while(i<j){
            while (i<j&&arr[j]>=temp){
                j--;
            }
            while (i<j&&arr[i]<=temp){
                i++;
            }
            if(i<j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quick_sort(arr,low,j-1);
        quick_sort(arr,j+1,high);
    }



}
