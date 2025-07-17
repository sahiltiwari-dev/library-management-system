import java.util.Scanner;
public class BitManipulation
{
    public static void setbit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for setbit");
        int n=sc.nextInt();
        System.out.println("enter position for setbit");
        int p=sc.nextInt();
        int bitmask=1<<p;//decimal is converted to binary
        int newnumber=bitmask|n;
        System.out.println(newnumber);


    }

    public static void clearbit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for clearbit");
        int n=sc.nextInt();
        System.out.println("enter position for clearbit");
        int p=sc.nextInt();
        int bitmask=1<<p;

        int bitnot  =~bitmask;
        int newnumber=bitnot & n;
        System.out.println(newnumber);

    }
    public static void updatebit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter position");
        int p=sc.nextInt();
        System.out.println("enter the number you want to update ur bit with ");
        int m=sc.nextInt();




        int bitmask;
            if(m==1)
            {
             bitmask=1<<p;
             int number=bitmask|n;
             System.out.println(number);
            }
            else {
                bitmask=1<<p;
                int notbit=~bitmask;
                int number=notbit & n;
                System.out.println(number);
            }

    }

    public static void Getbit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("enter position");
        int p=sc.nextInt();
        int bitmask=1<<p;
        if((bitmask & n)==0)
        {
            System.out.println("bit was zero");

        }
        else{
            System.out.println("bit was 1");
        }
    }
    public static void  main(String args[])
    {

        updatebit();



    }
}