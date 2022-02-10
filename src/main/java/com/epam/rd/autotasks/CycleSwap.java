package com.epam.rd.autotasks;

class CycleSwap {

    static void cycleSwap(int[] array) {

        if(array==null|| array.length==0)return;
        else
        {
            int temp=array[array.length-1];
            int[] array1=new int[array.length];
            System.arraycopy(array,0,array1,0,array.length);
            for (int i=1;i<array.length;i++)
            {
                array[i]=array1[i-1];
            }
            array[0]=temp;
        }
    }

    static void cycleSwap(int[] array, int shift) {

        if(array==null || array.length==0)return;
        else
        {
            int[] array1=new int[shift];
            int[] copyArray=new int[array.length];
            System.arraycopy(array,0,copyArray,0,array.length);
            System.arraycopy(array,array.length-shift,array1,0,shift);
            for(int i=0;i<array.length-shift;i++)
            {
                array[i+shift]=copyArray[i];
            }
            for(int i=0;i<array1.length;i++)
            {
                array[i]=array1[i];
            }
        }
    }
}