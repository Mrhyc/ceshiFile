/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/28 14:05
 */
public class 删除有序数组中的重复项26 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i==0||nums[i]!=nums[i-1]){
                nums[c++] = nums[i];
            }
        }
        return c;
    }
}
