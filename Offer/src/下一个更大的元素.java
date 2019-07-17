import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 下一个更大的元素 class
 *
 * @author Flc
 * @date 2019/7/17
 */
public class 下一个更大的元素 {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            int[] answer = new int[nums1.length];
            if(nums1.length == 0) {
                return null;
            }
            Map<Integer, Integer> map =new HashMap<>();
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < nums2.length; i++) {
                while(! stack.isEmpty() && stack.peek() > nums2[i]){
                    map.put(stack.pop(),nums1[i]);
                }
                stack.push(nums2[i]);
            }
            for(int i = 0; i < nums1.length; i++) {
                if(map.get(nums1[i]) == null) {
                    answer[i] = -1;
                }else {
                    answer[i] = map.get(nums1[i]);
                }
            }
            return answer;
        }
    }
}
