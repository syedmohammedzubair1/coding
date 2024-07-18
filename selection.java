public class selection {
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min])
                min=j;
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            }
    }
    public static void main(String[] args) {
        int[] arr = { 6,7,3,8,2,1,9};
        SelectionSort(arr);
        print(arr);
    }
}
