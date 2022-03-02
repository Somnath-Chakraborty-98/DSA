public class isPalindrome {

    String revStr="";
    public Boolean palin(String str){
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            revStr+=ch;
        }
        if(revStr.equals(str)) return true;
        else return false;
    }

    public static void main(String[] args) {
        isPalindrome obj=new isPalindrome();
        String str="EXE";
        System.out.println(obj.palin(str));
    }
}
