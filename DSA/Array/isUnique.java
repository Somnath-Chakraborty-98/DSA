public class isUnique {

    public boolean unique(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i] == arr[j]) return false;
        }

        return true;
    }

    public static void main(String[] args){
        isUnique obj = new isUnique();
        int arr[]={1,4,7,9,3,13,13};
        System.out.println(obj.unique(arr));
    }
}
