public class firstUppercase {
    
    public char upper(String str){
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)) return ch;
        }
        return '0';
    }

    public static void main(String[] args) {
        firstUppercase obj= new firstUppercase();
        String str="amshjdgtyuw";
        System.out.println(obj.upper(str));
    }
}
