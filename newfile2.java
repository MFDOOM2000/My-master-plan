// String cipher programs

import java.util.*;
public class Encryptor
{
    
    //Keyword cipher 
    
    public String Keyword(String S,String key)
    {
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
        return e;
    }
    
    // Latin alphabet cipher 
    
    public String Latinalphabet(String S)
    {
        String e="";
        for(int i=0;i<S.length();i++)
        if(S.charAt(i)!=' ')
        {
            int a=Math.abs(((S.charAt(i)-'A')%32)+1);
            e+=a+" ";
        }
        else
        e+="\t";
        return e;
    }
    
    //Autokey cipher

    public String Autokey(String S,char autokey)
    {
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
                {
                    int a=(w1.charAt(j)-'A')%32;
                    int b=(w2.charAt(j)-'A')%32;
                e+=(char)(((w1.charAt(j)>='a' && w2.charAt(j)<='z')?'a':'A')+(a+b)%26);
                }
            }
            e+=" ";
        }
            return e;
    }
    
    //Multiplicative cipher 

    public String Multiplicative(String S,int key)
    {
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
        return e;
    }
    
    //Affine cipher
    
    public boolean isPrime(int a)
    {
        for(int i=2;i<a;i++)
        if(a%i==0)
        return false;
        return true;
    }
    public String Affine(String S,int a,int b)
    {
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
        }
        else
        System.out.println("Invalid keyvalues. Enter again!");
        return e;
    }
    
    //Polybius Square cipher
    
    public String PolySquare(String S)
    {
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
        return e;
    }
    
    //Baconian cipher

    public String BaconBin(int n)
    {
        String e="";
        while(n!=0)
        {
            e+=(n%2==0)?'a':'b';
            n/=2;
        }
        return e;
    }
    public String Baconian(String S)
    {
        String e="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
                e+=BaconBin((S.charAt(i)-'A')%32);
            else
            e+=S.charAt(i);
        }
        return e;
    }
    
    //Rail Fence cipher 

    public String RailFence(String S,int key)
    {
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
        return e;
    }
    
    //Substitution cipher
    
    public String Substitution(String S,int key)
    {
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
        return e;
    }
    
    //Atbash cipher

    public String Atbash(String S)
    {
        String e="";
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)!=' ')
            e+=(char)('A'+(25-(S.charAt(i)-'A')%32)+((S.charAt(i)>='a' && S.charAt(i)<='z')?32:0));
            else
            e+=S.charAt(i);
        }
        return e;
    }
    
    //MF DOOM
    
    public String DOOM(String S)
    {
        S=Atbash(S);
        S=Substitution(S,1);
        S=RailFence(S,6);
        S=Affine(S,7,9);
        S=Multiplicative(S,2);
        S=Autokey(S,'N');
        S=Keyword(S,"DOOM");
        S=Baconian(S);
        S=PolySquare(S);
        S=Latinalphabet(S);
        return S;
    }
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence");
        String S=sc.nextLine();
        Encryptor obj=new Encryptor();
        System.out.println(obj.DOOM(S));
    }
}