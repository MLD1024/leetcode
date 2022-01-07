package Backtracking;

/**
 * @author Lz
 * @date 2021/12/6 14:07
 * @since 1.0.0
 * 0-1 背包
 */
public class knapsack {

    //存储背包中物品总重量的最大值
    public int maxW = Integer.MIN_VALUE;


    // 假设背包可承受重量100，物品个数10，物品重量存储在数组a中，那可以这样调用函数：
    // f(0, 0, a, 10, 100)

    /**
     * @param i     i表示考察到哪个物品了；
     * @param cw    cw表示当前已经装进去的物品的重量和；
     * @param items items表示每个物品的重量
     * @param n     n表示物品个数
     * @param w     w背包重量
     */
    public void f(int i, int cw, int[] items, int n, int w) {
        // cw==w表示装满了;i==n表示已经考察完所有的物品
        if (cw == w || i == n) {

            // 更新最大重量
            if (cw > maxW) {
                maxW = cw;
            }
            return;
        }


        // 已经超过可以背包承受的重量的时候，就不要再装了
        if (cw + items[i] <= w) {
            // 当前物品装进背包
            f(i + 1, cw + items[i], items, n, w);
        }


        //回溯
        //当前物品不装进背包
        f(i + 1, cw, items, n, w);
    }
}
