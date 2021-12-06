package Stack.有效的括号;

import java.util.Stack;

/**
 * @author Lz
 * @date 2021/11/22 9:09
 * @since 1.0.0
 */
public class Solution {

    public static void main(String[] args) {
//        System.out.println(isValid("()"));
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("([)]"));
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] data = s.toCharArray();
        if (data.length % 2 == 1) {
            return false;
        }
        for (int i = 0; i < data.length; i++) {
            char c = data[i];
            switch (c) {

                case ')':
                    if (stack.empty() || '(' != stack.pop()) {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                default:
                    stack.push(c);
            }

        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        int cur = 0;
        while (i >= 0 || j >= 0) {
//            if (i == -1) {
//                nums1[index--] = nums2[j--];
//            } else if (j == -1) {
//                nums1[index--] = nums1[i--];
//            } else if (nums1[i] > nums2[j]) {
//                nums1[index--] = nums1[i--];
//            } else {
//                nums1[index--] = nums2[j--];
//            }

            if (j == -1) {
                cur = nums2[i--];
            } else if (i == -1) {
                cur = nums1[j--];
            } else if (nums1[j] > nums2[i]) {
                cur = nums1[j--];
            } else {
                cur = nums2[i--];
            }
            nums1[index--] = cur;

        }


    }
}
