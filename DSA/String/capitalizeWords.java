public class capitalizeWords {
    
    String capWord="";
    public String capital(String str){
        for(int i=0;i<str.length();i++){
            if(i==0) capWord+=Character.toUpperCase(str.charAt(i));
            else if(str.charAt(i-1)== ' ') capWord+=Character.toUpperCase(str.charAt(i));
            else capWord+=str.charAt(i);
        }
        return capWord;
    }

    public static void main(String[] args) {
        capitalizeWords obj=new capitalizeWords();
        String str="hunter king";
        System.out.println(obj.capital(str));
    }
}
