// String cipher programs

//Keyword cipher 

/*import java.util.*;
public class Keywordcipher
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Keyword");
        String key=sc.nextLine();
        System.out.println("Enter a string");
        String S=sc.nextLine();
        key=key.toUpperCase();
        String lb="";
        int p1=0;
        String e="";
        for(int i=0;i<key.length();i++)
        {
            if(lb.indexOf(key.charAt(i))<0)
            {
                lb+=key.charAt(i);
                p1++;
            }
        }
        for(char i='A';i<='Z';i++)
        {
            if(key.indexOf(i)<0)
            {
                lb+=i;
                p1++;
            }
        }
        for(int i=0;i<S.length();i++)
        if(S.charAt(i)!=' ')
        e+=(char)(lb.charAt((S.charAt(i)-'A')%32)+((S.charAt(i)>='a' && S.charAt(i)<='z')?32:0));
        else
        e+=S.charAt(i);
        System.out.println("The encrypted string:"+e);
    }
}*/

// Latin alphabet cipher

/*import java.util.*;
public class Latinalphabetcipher
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence");
        String S=sc.nextLine();
        String e="";
        for(int i=0;i<S.length();i++)
        if(S.charAt(i)!=' ')
        e+=(((S.charAt(i)-'A')%32)+1)+" ";
        else
        e+=S.charAt(i)+" ";
        System.out.println("The encrypted string:"+e);
    }
}*/

//Autokey cipher

/*import java.util.*;
public class Autokeycipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the Autokey");
        char autokey=(sc.nextLine()).charAt(0);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        String e="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
            {
                int m=i;
                while(i<S.length() && S.charAt(i)!=' ')
                i++;
                String w1=S.substring (m,i);
                String w2=autokey + w1.substring(0,w1.length()-1);
                for(int j=0;j<w1.length();j++)
                e+=(char)('A'+((w1.charAt(j)-'A')%32+(w2.charAt(j)-'A')%32)%26);
            }
            e+=" ";
        }
            System.out.println("The encrypted string:"+e);
    }
}*/

//Multiplicative cipher 

/*import java.util.*;
public class Multiplicativecipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        System.out.println("Enter the Key");
        int key=sc.nextInt();
        String e="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
            {
                int a=(int)(S.charAt(i)-'A')%32;
                e+=(char)(((a*key)%26)+((S.charAt(i)>='a' && S.charAt(i)<='z')?'a':'A'));
            }
            else
            e+=S.charAt(i);
        }
        System.out.println("The encrypted string:"+e);
    }
}*/

//Affine cipher

/*import java.util.*;
public class Affinecipher
{
    public static boolean isPrime(int a)
    {
        for(int i=2;i<a;i++)
        if(a%i==0)
        return false;
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        System.out.println("Enter the Keyvalues");
        int a=sc.nextInt();
        int b=sc.nextInt();
        String e="";
        if(isPrime(a) && a%13!=0)
        {
            for(int i=0;i<S.length();i++)
            if(S.charAt(i)!=' ')
            {
                int x=(((S.charAt(i)-'A')%32)*a+b)%26;
                e+=(char)(x+((S.charAt(i)>='a' && S.charAt(i)<='z')?'a':'A'));
            }
            else
            e+=S.charAt(i);
            System.out.println("The encrypted string:"+e);
        }
        else
        System.out.println("Invalid keyvalues. Enter again!");
    }
}*/

//Polybius Square cipher

/*import java.util.*;
public class PolySquarecipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        String e="";
        for(int i=0;i<S.length();i++)
        {
               char ch=S.charAt(i);
               if(S.charAt(i)!=' ')
            {
                int col,row;
                if((ch>='j' && ch<='z')  || (ch>='J' && ch<='Z'))
                {
                    row=((ch-'A')%32-1)/5+1;
                    col=((ch-'A')%32-1)%5+1;
                }
                else
                {
                    col=((ch-'A')%32)%5+1;
                    row=((ch-'A')%32)/5+1;
                }
                e+=row;
                e+=col;
            }
            else
            e+=S.charAt(i);
        }
        System.out.println("The encrypted string:"+e);
    }
}*/

//Baconian cipher

/*import java.util.*;
public class Baconiancipher
{
    public static String BaconBin(int n)
    {
        String e="";
        while(n!=0)
        {
            e+=(n%2==0)?'a':'b';
            n/=2;
        }
        return e;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        String e="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
                e+=BaconBin((S.charAt(i)-'A')%32);
            else
            e+=S.charAt(i);
        }
        System.out.println("The encrypted string:"+e);
    }
}*/

//Rail Fence cipher 

/*import java.util.*;
public class RailFencecipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        System.out.println("Enter the Key");
        int key=sc.nextInt();
        String e="";
        for(int i=1;i<=key;i++)
        {
            int d=2*(i-1),np=i-1;
            while(np<S.length())
            {
                if(d!=0)
                {
                    e+=S.charAt(np);
                    np+=d;
                }
                d=(2*(key-1))-d;
            }
        }
        System.out.println("The encrypted string:"+e);
    }
}*/

//Substitution cipher

/*import java.util.*;
public class Substitutioncipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        System.out.println("Enter the Key");
        int key=sc.nextInt();
        String e="";
        String lb="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        lb=lb.substring(key)+lb.substring(0,key);
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
            e+=(char)(lb.charAt((S.charAt(i)-'A')%32)+((S.charAt(i)>='a' && S.charAt(i)<='z')?32:0));
            else
            e+=S.charAt(i);
        }
        System.out.println("The encrypted string:"+e);
    }
}*/

//Atbash cipher

/*import java.util.*;
public class Atbashcipher
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string");
        String S=sc.nextLine();
        String e="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
            e+=(char)('A'+(25-(S.charAt(i)-'A')%32)+((S.charAt(i)>='a' && S.charAt(i)<='z')?32:0));
            else
            e+=S.charAt(i);
        }
        System.out.println("The encrypted string:"+e);
    }
}*/