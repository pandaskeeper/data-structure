package com.github.allen.arithmetic;

public class Sort {

    //1.插入排序
    public static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j;
            int x = arr[i];//x为待插入元素
            for (j = i; j > 0 && x < arr[j - 1]; j--) {//通过循环，逐个后移一位找到要插入的位置。
                arr[j] = arr[j - 1];
            }
            arr[j] = x;//插入
        }
    }

    //5.希尔排序
    public static void shellSort(int[] arr) {
        int dk = arr.length / 2;
        while (dk >= 1) {
            ShellInsertSort(arr, dk);
            dk = dk / 2;
        }
    }

    private static void ShellInsertSort(int[] a, int dk) {//类似插入排序，只是插入排序增量是1，这里增量是dk,把1换成dk就可以了
        for (int i = dk; i < a.length; i++) {
            if (a[i] < a[i - dk]) {
                int j;
                int x = a[i];//x为待插入元素
                a[i] = a[i - dk];
                for (j = i - dk; j >= 0 && x < a[j]; j = j - dk) {//通过循环，逐个后移一位找到要插入的位置。
                    a[j + dk] = a[j];
                }
                a[j + dk] = x;//插入
            }

        }

    }

    //2.选择排序
    public static void selectSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int k=i;//k存放最小值下标。每次循环最小值下标+1
            for(int j=i+1;j<arr.length;j++){//找到最小值下标
                if(arr[k]>arr[j])
                    k=j;
            }
            swap(arr,k,i);//把最小值放到它该放的位置上
        }
    }
    private static void swap(int[] data, int i, int j) {
        if (i != j) {
            data[i] = data[i] + data[j];
            data[j] = data[i] - data[j];
            data[i] = data[i] - data[j];
        }
    }

    //3.冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //4.快速排序
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = getMiddle(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
    }


    //6.堆排序
    public static void heapSort(int[] arr) {

    }

    private static int getMiddle(int[] array, int low, int high) {
        int key = array[low];
        while (low < high) {
            if (low < high && array[high] >= key) {
                high--;

            }
            array[low] = array[high];
            if (low < high && array[low] <= key) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = key;
        return low;
    }
}
