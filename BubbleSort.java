import java.io.*;
import java.util.Scanner;
class BubbleSort
{
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    }
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            }
            System.out.println("The array before sorting is: ");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
                }
                System.out.println();
                bubblesort(arr);
                System.out.println("The array after sorting is: ");
                print(arr);
    }
}