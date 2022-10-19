// Задача 2. Реализовать алгоритм пирамидальной сортировки (HeapSort)
public class Sem1_task2 {

    public void heapSort(int[] arr)
    {
        int count = arr.length;
 
        for (int i = count/2 - 1; i >= 0; i--) {
            toHeap(arr, count, i);
        }
 
        for (int i = count-1; i > 0; i--) {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            toHeap(arr, i, 0);
        }
    }
 
    void toHeap(int[] arr, int count, int i)
    {
        int maxNum = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
 
        if (left < count && arr[left] > arr[maxNum])
            maxNum = left;
 
        if (right < count && arr[right] > arr[maxNum])
            maxNum = right;
 
        if (maxNum != i) {
            int temp = arr[i];
            arr[i] = arr[maxNum];
            arr[maxNum] = temp;
 
            toHeap(arr, count, maxNum);
        }
    }
 
    static void showArray(int[] arr)
    {
        int count = arr.length;
 
        for (int i = 0; i < count; ++i) {
            System.out.printf("%d ", arr[i]);
        }
    }
 
    public static void main(String args[])
    {
        int[] arr = { 2, 31, 40, 6, 86, 14, 235, 9, 99 };
    
        Sem1_task2 ob = new Sem1_task2();
        ob.heapSort(arr);
        
        showArray(arr);
    }
}
