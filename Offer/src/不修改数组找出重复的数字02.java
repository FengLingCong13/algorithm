/**
 * 不修改数组找出重复的数字 class
 *
 * @author Flc
 * @date 2019/7/15
 */
public class 不修改数组找出重复的数字02 {
    public static int getDuplicate(int[] numbers, int length){
       if(numbers == null || length <=0) {
           return -1;
       }
       int start = 1;
       int end = length - 1;
       while(end >= start) {
           int middle = (start + end) / 2;
           int count = 0;
           for(int i = 0; i < length; i++) {
               if(numbers[i] <=middle && numbers[i] >=start) {
                   count++;
               }
           }
           if(start == end) {
               if(count > 1) {
                   return start;
               }else {
                   return -1;
               }
           }
           if(count > middle - start +1) {
               end = middle;
           }else {
               start = middle + 1;
           }
       }
       return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 3, 1};
        System.out.println(getDuplicate(nums, nums.length));
    }


}
