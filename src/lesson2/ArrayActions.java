package lesson2;

public class ArrayActions {

    private int[] arr;
    private int arrIndex = 0;
    ArrayActions(int size) {
        this.arr = new int[size];
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    void insert(int value) {
        if(arrIndex > arr.length - 1) {
            System.out.println("Массив заполнен");
           return;
        }
        arr[arrIndex] = value;
        arrIndex++;
    }

    int[] get() {
        return arr;
    }

    int search(int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid;
        while (min <= max) {
            mid = (min + max) / 2;
            if (value == arr[mid]) {
                return mid;
            } else {
                if (value < arr[mid]) {
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            }
        }
        return -1;
    }

    void remove(int value) {
        int key = search(value);
        if(key >= 0) {
            for (int j = key; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arrIndex--;
        }
    }
}
