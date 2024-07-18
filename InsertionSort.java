import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
            System.out.println("The array before sorting is: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
                }
            System.out.println();
                System.out.println("The array after sorting is: ");
            insertionSort(arr);

    }
    public static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j = j-1;
                }
                a[j+1] = key;
                }
                for(int i=0;i<a.length;i++){
                    System.out.print(a[i]+" ");
                    }
                    
    }
}
