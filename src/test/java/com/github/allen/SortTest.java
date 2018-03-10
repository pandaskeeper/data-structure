package com.github.allen;

import com.github.allen.arithmetic.Sort;
import com.github.allen.data.ArrayData;
import org.junit.Test;

import java.util.Arrays;


public class SortTest {

    @Test
    public void insertSortTest(){
        int[] arr = Arrays.copyOf(ArrayData.arr,ArrayData.arr.length);
        StringBuilder sb = new StringBuilder();
        //排序前
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
        //排序后
        sb.delete(0,sb.length());
        Sort.insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void selectSortTest(){
        int[] arr = Arrays.copyOf(ArrayData.arr,ArrayData.arr.length);
        StringBuilder sb = new StringBuilder();
        //排序前
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
        //排序后
        sb.delete(0,sb.length());
        Sort.selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void bubbleSortTest(){
        int[] arr = Arrays.copyOf(ArrayData.arr,ArrayData.arr.length);
        StringBuilder sb = new StringBuilder();
        //排序前
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
        //排序后
        sb.delete(0,sb.length());
        Sort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void quickSortTest(){
        int[] arr = Arrays.copyOf(ArrayData.arr,ArrayData.arr.length);
        StringBuilder sb = new StringBuilder();
        //排序前
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
        //排序后
        sb.delete(0,sb.length());
        Sort.quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void shellSortTest(){
        int[] arr = Arrays.copyOf(ArrayData.arr,ArrayData.arr.length);
        StringBuilder sb = new StringBuilder();
        //排序前
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
        //排序后
        sb.delete(0,sb.length());
        Sort.shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
    }

    @Test
    public void heapSortTest(){
        int[] arr = Arrays.copyOf(ArrayData.arr,ArrayData.arr.length);
        StringBuilder sb = new StringBuilder();
        //排序前
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
        //排序后
        sb.delete(0,sb.length());
        Sort.heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            int i1 = arr[i];
            sb.append(i1).append(" ");
        }
        System.out.println(sb.toString());
    }

}
