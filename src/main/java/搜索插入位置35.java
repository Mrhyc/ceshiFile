import java.util.ArrayList;
import java.util.List;

/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/28 17:43
 */
public class 搜索插入位置35 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }
    /*public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target||(i!=0&&nums[i]>target&&nums[i-1]<target)){
                return i;
            }
        }
        return nums[0]>target?0:nums.length;
    }*/

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int ans = nums.length;
        while (left<=right){
            int mid = (right-left)/2+left;
            if(target<=nums[mid]){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }
}
