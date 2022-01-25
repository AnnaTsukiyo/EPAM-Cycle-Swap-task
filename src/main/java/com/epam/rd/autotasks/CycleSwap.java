package com.epam.rd.autotasks;

class CycleSwap {

    static void cycleSwap(int[] array) {
        if (array.length > 0 && array != null) {
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = array.length - 1;
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length < 0 && array == null) {
            shift = 0;
        }
        for (int i = 0; i < shift; i++) {
            int temp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }
}

