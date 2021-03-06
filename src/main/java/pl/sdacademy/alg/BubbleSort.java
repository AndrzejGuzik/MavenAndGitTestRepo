package pl.sdacademy.alg;

public class BubbleSort {

    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }
    // jakiś komentarz


    public int[] sort() {
        if(array == null) {
            return new int[0];
        }
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < (array.length - j - 1); i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
        return array;
    }

    protected void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
