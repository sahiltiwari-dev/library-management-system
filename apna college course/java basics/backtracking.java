public class backtracking {
    public static void printpermutations(String str,String permuatations)
    {
        if(str.length()==0)
        {
            System.out.println(permuatations);
            return;
        }    
        
        for(int i=0;i<str.length();i++)
        {
            char currchar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printpermutations(newStr,permuatations+currchar);
        }
    }

    public static void main(String args[])
    {
String str="ABC";
printpermutations(str,"");
    }
}
