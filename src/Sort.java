import java.util.ArrayList;

public class Sort {

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static int[] bubbleSort(int[] array) {
        int swaps = 1;
        while (swaps > 0) {
            swaps = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    swaps++;
                }
            }
        }
        return array;

    }
    private static void swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static String[] bubbleSort(String[] array) {
        int swaps = 1;
        while (swaps > 0) {
            swaps = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareToIgnoreCase(array[i+1]) > 0) {
                    swap(array, i, i+1);
                    swaps++;
                }
            }
        }
        return array;

    }
    private static void swap(ArrayList<Integer> list, int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        int swaps = 1;
        while (swaps > 0) {
            swaps = 0;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    swap(list, i, i+1);
                    swaps++;
                }
            }
        }
        return list;

    }

    private static int smallestIndex(int[] array, int start){
        int smallest = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < array[smallest]) {
                smallest = i;
            }
        }
        return smallest;
    }
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = smallestIndex(array, i);
            swap(array, i, smallest);
        }
        return array;

    }

    private static int smallestIndex(String[] array, int start){
        int smallest = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i].compareToIgnoreCase(array[smallest]) < 0) {
                smallest = i;
            }
        }
        return smallest;
    }
    public static String[] selectionSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = smallestIndex(array, i);
            swap(array, i, smallest);
        }
        return array;
    }

    private static int smallestIndex(ArrayList<String> list, int start){
        int smallest = start;
        for (int i = start + 1; i < list.size(); i++) {
            if (list.get(i).compareToIgnoreCase(list.get(smallest)) < 0) {
                smallest = i;
            }
        }
        return smallest;
    }
    private static void swap(int a, int b, ArrayList<String> list) {
        String temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int smallest = smallestIndex(list, i);
            swap(i, smallest, list);
        }
        return list;
    }

}
