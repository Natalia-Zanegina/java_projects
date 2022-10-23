// Задача 2. Реализовать алгоритм сортировки вставками.
public class Sem2_task2 {
    public static void insertionSort(int[] sortArr) {
        int j;
        int count = sortArr.length;
        for (int i = 1; i < count; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
    static void showArray(int[] arr)
    {
        int count = arr.length;
 
        for (int i = 0; i < count; ++i) {
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2, 31, 40, 6, 86, 14, 235, 9, 99 };
        insertionSort(arr);
        showArray(arr);
    }     
}
    
