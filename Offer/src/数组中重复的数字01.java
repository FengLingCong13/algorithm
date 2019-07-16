/**
 * 数组中重复的数字 class
 *
 * @author Flc
 * @date 2019/7/15
 */
public class 数组中重复的数字01 {
    public class Solution {
        // Parameters:
        //    numbers:     an array of integers
        //    length:      the length of array numbers
        //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
        //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
        //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
        // Return value:       true if the input is valid, and there are some duplications in the array number
        //                     otherwise false
        public boolean duplicate(int numbers[],int length,int [] duplication) {
            if(length == 0) {           //如果长度为0，直接返回false
                return false;
            }
            for(int i = 0; i < length; i++) {   //外层循环，遍历每一个数字
                if(numbers[i] == i) {           //如果i位置上的数字==i，就继续循环，不用换位置
                    continue;
                }
                while(numbers[i] != i) {        //循环条件，当i位置上的值不等于i时
                    int temp = numbers[numbers[i]];    //取一个临时变量temp，取（i位置上的值）的位置
                    if(temp == numbers[i]){         //如果发现两个数是一样的，就直接返回true
                        duplication[0] = temp;
                        return true;
                    }
                    numbers[numbers[i]] = numbers[i];   //否则，交换两个位置的值，直到numbers[i]==i才结束循环
                    numbers[i] = temp;
                }
            }
            return false;
        }
    }
}
