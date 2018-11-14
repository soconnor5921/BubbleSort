package com.company;

public class Main
{

    public static void main(String[] args)
    {

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
        boolean running = true;
        while(running)
        {
            
        }
    }

    public void selectionSort(int[] arr)
    {

    }

    public int[] randIntArr(int count)
    {
        int[] arr = new int[count];
        for(int i = 0; i < count; i++)
        {
            arr[i] = (int)(Math.random()*10000);
        }
        return arr;
    }
}
