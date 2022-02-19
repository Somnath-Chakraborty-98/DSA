//Sorting
//I and J and check for each elemnt 
public class permutation {
    public boolean excercise(int [] arr1,int [] arr2){
        if(arr1.length != arr2.length) return false;
        int sum1=0,sum2=0;
        int mul1=1,mul2=1;
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
            mul1*=arr1[i];
            mul2*=arr2[i];
        }
        if(sum1==sum2 && mul1==mul2) return true;
        else return false;

    }

    public static void main(String[] args){
        permutation obj = new permutation();
        int arr1[]={1,3,6,9,5};
        int arr2[]={1,5,3,6,9};
        System.out.println(obj.excercise(arr1, arr2));
    }
}
