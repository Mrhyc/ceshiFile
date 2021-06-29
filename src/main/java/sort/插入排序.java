package sort;

import java.util.Arrays;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/18 8:33
 */
public class 插入排序 {
    public static void main(String[] args) {
        int[] a = {10,20,15,30,9,28,38};
        System.out.println(Arrays.toString(a));
        insertSort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void insertSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while (j>0){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    j--;
                }else{
                    break;
                }
            }
        }
    }
}
