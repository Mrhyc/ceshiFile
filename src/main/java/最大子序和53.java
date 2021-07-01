/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/30 8:58
 */
public class 最大子序和53 {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int max =nums[0];
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre +nums[i],nums[i]);
            max = Math.max(max,pre);
        }
        return max;
    }
}
