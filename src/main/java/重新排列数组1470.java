import java.util.Arrays;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 17:30
 */
public class 重新排列数组1470 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr, 4)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        for(int i=0;i<n;i++){
            arr[i*2] =nums[i];
            arr[i*2+1]=nums[i+n];
        }
        return arr;
    }
}
