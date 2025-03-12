package chen.practice.example.algorithm.tools;

public class SwapTool {
    //交换位置，i != j
    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        //异或的 交换律 与 结合律 特性
        //相同为0，不同为1； 0^N = N,N^N = 0;
        //初始：arr[i] = 甲 arr[j] = 乙
        arr[i] = arr[i] ^ arr[j]; //arr[i] = 甲 ^ 乙 ； arr[j] = 乙
        arr[j] = arr[i] ^ arr[j];//arr[j] = 甲 ^ 乙 ^ 乙 = 甲 ^ 0 = 甲；  arr[i] = 甲 ^ 乙
        arr[i] = arr[i] ^ arr[j];//arr[i] = 甲 ^ 乙 ^ 甲 = 乙 ^ 0 = 乙；  arr[i] = 甲

    }
}
