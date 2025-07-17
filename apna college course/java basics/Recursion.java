import java.util.Scanner;
public class Recursion
{

    public static int calcfactorial(int n)
    {
        if(n==1||n==0)// base case
        {
            return 1;
        }
        else
        {
            return n*calcfactorial(n-1);
        }
    }
    public static void fibonaaci(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        else {
            int c = a + b;
            System.out.print(c+" ");
            fibonaaci(b, c, n - 1);
        }
    }


    public static void towerofhanoi(int n,String s,String h,String d)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n +"from "+s + "to"+d);
        }
        else {
            towerofhanoi(n - 1, s, d, h);
            System.out.println("transfer disk " + n + "from " + s + "to" + d);
            towerofhanoi(n - 1, h, s, d);
        }


    }
    public static void stringrev(String s )
    {

        if(s.length()==1)
       {
           System.out.println(s);
       }
       else
           System.out.print(s.charAt(s.length()-1));
       stringrev(s.substring(0, s.length() - 1));
       }
       public static void main(String args[])
       {

       }
    }

