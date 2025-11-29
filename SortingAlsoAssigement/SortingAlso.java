public class SortingAlso {

    public static void bubbleSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++ ){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        printArr(arr);

    }
}
