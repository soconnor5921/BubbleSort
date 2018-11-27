package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] arr = randIntArr(10);
        System.out.println(arr);
        quickSort(arr, 2, 5);
        System.out.println(arr);
    }

    public static int[] swap(int[] array, int pos1, int pos2)
    {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
        return array;
    }

    public void bubbleSort(int[] arr)
    {

    }

    public void selectionSort(int[] arr)
    {

    }

    public static int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left-1;
        int temp;
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                temp = i; i = j; j = temp;
            }
        }
        temp = arr[i+1]; arr[i+1] = arr[right]; arr[right] = temp;
        return i+1;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot -1);
            quickSort(arr, pivot + 1, right);
        }
    }
}
