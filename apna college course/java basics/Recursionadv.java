import java.util.Scanner;
public class Recursionadv
{

    public static void permuations(String s,String permutation) {
        if(s.length()==0)
        {
            System.out.println(permutation);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1);
            permuations(newString,permutation+s.charAt(i));
        }
    }
    public static int mazemove(int i,int j,int m,int n)
    {
        if(i==n || j==m)
        {
            return 0;
        }

if(i==m-1 && j==n-1)
{
    return 1;

}
else {
    int down = mazemove(i + 1, j, m, n);
    int up = mazemove(i, j + 1, m, n);
    return down + up;
}

    }
    public static int  placetiles(int n,int m)
    {
        if(n==m)
        {
return 2;
        }
        if(n<m)
        {
            return 1;
        }
       int vertiles= placetiles(n-m,m);
       int horizontiles= placetiles(n-1,m);
       return vertiles+horizontiles;
    }
    public static void   invite(int n) {
        if (n == 1) {
            System.out.println(1);
        }
        else if (n == 2) {
            System.out.println(3);
        } else {
            System.out.println((n + (n * (n - 1)) / 2));

        }
    }

    
    public static void main(String args[])
    {
        int n=4;
    
    }
}