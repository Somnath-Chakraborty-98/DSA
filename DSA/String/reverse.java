public class reverse {
    
    String revStr="";
    public String rev(String str){
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            revStr+=ch;
        }
        return revStr;
    }

    public static void main(String[] args) {
        reverse obj=new reverse();
        String str="Java";
        System.out.println(obj.rev(str));
    }
}


/*
Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
*/
