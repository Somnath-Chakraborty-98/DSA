public class linearSearch{


    int search(int[] arr,int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value){
                System.out.println("The element is found at index " + i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }


    public static void main(String[] args) {
        linearSearch ls = new linearSearch();
        int arr[]= {2,4,7,9,3,5,7};
        ls.search(arr, 3);
    }
}