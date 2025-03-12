package chen.practice.example.algorithm;

import static chen.practice.example.algorithm.tools.SwapTool.swap;

/**
 * 数组长度为N，升序排序
 *
 * 选择排序：
 * 遍历数组,每一轮遍历都在 i (0 <= i <N-1) 至  N-1 的位置范围内的元素中找最值，
 * 取变量 a 记录较小值的角标，默认值为i，取变量a记录的元素依次与从i + 1开始的每一个元素进行对比，
 * 若存在比它还小的元素，则变量a记录这个元素的下标,否则变量a值不变
 * 直到与N-1位置元素对比完，得到当前轮中的最值元素的角标，
 * 交换 遍历范围内的第一个元素 即 i 元素 与 变量a记录的角标对应元素的位置,
 * 然后 i++ 又从下一个位置开始 对比 i 至 N-1范围内的元素，找到最值并与i交换位置(每一轮遍历都能确定一个下标范围内的最值)
 *
 * 时间复杂度：O(N^2)  空间复杂度：O(1)
 *
 * 图解见 D:\study\algorithm\pictures\选择排序.jpg
 */
public class Code01_SelectionSort {

    public static void selectionSort(int[] arr) {

        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) { //遍历 i ~ N-1 下标范围内的元素
            //寻找范围内最值
            int minValIndex = i;//默认：初始元素i为最值
            //minValIndex依次与i的后面的元素对比，记录较小值的位置
            for (int j = i + 1; j < arr.length; j++) {
                //记录较小值的位置
                minValIndex = arr[j] < arr[minValIndex] ? j : minValIndex;
            }
            //一轮对比结束，找到最值，交换位置
            swap(arr, i, minValIndex);
        }

    }


    public static void main(String[] args) {
        int[] arr = {3,10,2,13,9,1,1,2,4};
        System.out.println("排序前：" );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        selectionSort(arr);
        System.out.println("排序后：" );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
