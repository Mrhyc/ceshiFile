/**
 * @author huangyuchen
 * @version 1.0
 * @date 2021/6/21 14:47
 */
public class 找出所有子集的异或总和再求和1863 {
    private static int res = 0;
    public static void main(String[] args) {
        int[] nums={5,1,6};
        subsetXORSum(nums);
        System.out.println(res);
    }
    public static int subsetXORSum(int[] nums) {
        if(nums.length==1)return nums[0];
        dfs(nums,0,0);
        return res;
    }

    private static void dfs(int[] nums, int start, int temp) {
        if(start == nums.length){
            res+=temp;
            return;
        }
        dfs(nums,start+1,temp^nums[start]);
        dfs(nums,start+1,temp);
    }

    public static  void subsetXORSum(int[] nums, int start, int temp) {
        res += temp;
        for (int i = start; i < nums.length; i++) {
            subsetXORSum(nums, i+1, temp ^ nums[i]);
        }
    }
}
