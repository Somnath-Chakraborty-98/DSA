public class binarySearch {

    int search(int[] arr, int value){
        int a=0,b=arr.length;
        int mid = findMid(a, b);
        while(a <= b){
            if(arr[mid] == value){
                System.out.println("Element found at index " + mid);
                return mid;
            }
            else if(value < arr[mid]) b=mid-1;

            else {
                if(mid +1<arr.length) a=mid+1;
                else break;   
            }

            mid=findMid(a, b);
        }
        System.out.println("Element not found");
        return -1;
        
    }


    int findMid(int a, int b){
        return (a+b)/2;
    }


    public static void main(String[] args) {
        int [] arr={2,5,7,8,9,11,15,67};

        binarySearch bs= new binarySearch();

        bs.search(arr, 67);
    }
}
