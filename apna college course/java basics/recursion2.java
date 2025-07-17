import java.util.HashSet;
import java.util.Scanner;
public class recursion2 {
    public static int first = -1;
    public static int last = -1;

    public static void firstandlast(String s, int index, char a) {
        if (index == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;

        }
        if (s.charAt(index) == a) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }

        }
        firstandlast(s, index + 1, a);
    }

    public static void movetolast(int i, int c, String newString, String s, char check) {

        if (i >= s.length()) {

            newString = newString + String.valueOf(check).repeat(c);
            System.out.println(newString);
            return;
        }

        if (i == s.length() - 1) {
            if (s.charAt(i) == check) {
                c++;
            } else {
                newString = newString + s.charAt(i);
            }
            for(int j=0;j<c;j++)
            {
                newString +=check;
            }
            System.out.println(newString);
            return;
        }

        if (s.charAt(i) == check) {

            movetolast(i + 1, c + 1, newString, s, check);
        } else {
            newString = newString + s.charAt(i);
            movetolast(i + 1, c, newString, s, check);
        }
    }
        public static void removeduplicate(char x[],int i,int c,String s,String s1) {
            if (i == 26) {
                System.out.println(s1);
            } else {
                char ch = x[i];
                for (int j = 0; j < s.length() - 1; j++) {
                    if (s.charAt(j) == ch) {
                        c++;
                    }

                }
                if (c > 0) {
                    s1 = s1 + ch;
                    removeduplicate(x,i + 1, 0, s, s1);

                }
                else{
                removeduplicate(x,i + 1, 0, s, s1);}
            }
        }
    public static void subsequence(int index,String str,String newString,HashSet<String>set)
    {
        if(index==str.length())
        {
            if(set.contains(newString))
                return;
            else{
                System.out.print(newString);
                set.add(newString);
            }

        }
        else {
            char ch = str.charAt(index);
           subsequence(index+1,str, newString+ch,set);
            subsequence(index+1,str,newString,set);
        }

    }

    public static boolean strict(int x[], int index) {
        if (index == x.length - 1) {
            return true;
        }
        if (x[index] < x[index + 1]) {
            return strict(x, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        HashSet<String>set=new HashSet<>();//keeps only unique elements stored
       subsequence(0,"aaa"," ",set);
int x[]={0,1,2,3,4,5,6,7,8,9};
char l[]={'.','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};


    }
}