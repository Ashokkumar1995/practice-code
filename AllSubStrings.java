import java.util.*;

public class AllSubStrings{

    public static Vector <String>results= new Vector<String>();
    public static void subStrings(String prefix, String str){
        if(str.length()==0){
            // System.out.println(prefix);
            results.add(prefix);
        }
        for(int i=0;i<str.length();i++){
            subStrings(prefix+str.charAt(i),str.substring(0, i)+str.substring(i+1, str.length()));
        }
    } 

    public static void main(String[] args){
        System.out.println("Enter the string");
        Scanner in = new Scanner(System.in);
        String input=in.nextLine();
        subStrings("",input);
        for(int i=0;i<results.size();i++){
            System.out.println(results.get(i));
        }
        
    }
}