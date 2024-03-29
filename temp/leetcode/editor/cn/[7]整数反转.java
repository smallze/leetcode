//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2992 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int result = 0;
        //32位整数范围 [-2^31,2^31-1] 即 [-2147483648,2147483647]
        while(x!=0){
            int temp = x%10;
            if(result>214748364||(result == 214748364 && temp>7)){
                return 0;
            }
            if(result<-214748364||(result == -214748364 && temp<-8)){
                return 0;
            }
            result = result*10+temp;
            x/=10;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
