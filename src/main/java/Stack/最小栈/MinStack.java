package Stack.最小栈;

import java.util.Stack;

/**
 * @author Lz
 * @date 2021/11/16 9:18
 * @since 1.0.0
 */
public class MinStack {
    // 定义两个栈
    // 正常存放数据的
    public static Stack<Integer> stack = new Stack<>();
    // 存放最下值的
    public static Stack<Integer> helper = new Stack<>();

    public static void push(Integer data) {
        // 目标栈正常入栈
        stack.push(data);

        if (helper.isEmpty()) {
            helper.push(data);
        }
        // 判断栈顶与要 push 元素的大小
        else if (helper.peek() <= data) {
            helper.push(data);
        } else {
            helper.push(helper.peek());
        }
    }

    public static Integer pop() {
        if (stack.isEmpty()) {
            return null;
        }
        helper.pop();
        return stack.pop();
    }

    public static Integer getMin() {
        return helper.isEmpty() ? null : helper.peek();
    }
}

class getMinStack1 {

    private Stack<Integer> stack = new Stack<Integer>();
    // 记录目前最下值
    private int min;

    public void push(int x) {
        if (stack.isEmpty()) {
            min = x;
            stack.push(0);
        } else {
            // 计算差值
            int compare = x - min;
            stack.push(compare);
            // 如果差值小于0，显然 x 成为最小值，否则最小值不变
            min = compare < 0 ? x : min;
        }
    }

    public void pop() {
        int top = stack.peek();
        // 如果top小于0，显然最小值也一并会被删除，此时更新最小值
        min = top < 0 ? (min - top) : min;
        stack.pop();
    }

    public int getMin() {
        return min;
    }
}