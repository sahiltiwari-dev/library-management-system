import java.util.Scanner;
public class Sorting
{
    public static void bubblesort(int x[])
    {
        //compare adjacent nos
        //pick big one throw at last
        for(int i=0;i<x.length-1;i++)
        {
            for(int j=0;j<x.length-i-1;j++)
            {
                if (x[j] > x[j + 1])
                {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        System.out.println("elements of  bubble sorted array are ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }

    }
    public static void selectionsorting(int x[])
    {
        //take smallest
        // element and place it in the first position
        for(int i=0;i<x.length;i++)
        {
            int small=i;
            for(int j=i+1;j<x.length;j++)
            {
                if(x[small]>x[j])
                {
                    small=j;
                }

            }
            int temp=x[small];
            x[small]=x[i];
            x[i]=temp;
        }
        System.out.println("elements of  selection sorted array are ");
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
        }


    }


    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter the number of numbers u want to sort ");
        int n=sc.nextInt();
        int y[]=new int[n];
        System.out.println(" enter the elements ");
        for(int i=0;i<n;i++)
        {
            y[i]=sc.nextInt();
        }
bubblesort(y);
        selectionsorting(y);



    }
}