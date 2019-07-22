/**
 * 两数相加1 class
 *
 * @author Flc
 * @date 2019/7/22
 */
public class 两数相加1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] answer = new int[2];
            if(nums.length < 2) {
                return answer;
            }
            for(int i = 0; i < nums.length - 1; i++) {
                for(int j = i + 1; j < nums.length; j++) {
                    if(nums[i] + nums[j] == target) {
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
            return answer;
        }
    }
}
