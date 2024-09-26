//Number Programs 

/*import java.util.*;
public class Numprogs
{

//Fascinating number 
  
  public boolean fascinating(int n)
  {
    String s=""+n+(2*n)+(3*n);
    for(char i='1';i<='9';i++)
    {
        if(s.indexOf(i)<0 || s.lastIndexOf(i)!=s.indexOf(i))
        return false;
    }
    return true;
  }

//Evil number

    public boolean evil(int n)
    {
        int c=0;
        while(n!=0)
        {
            if(n%2==1)
            c++;
            n/=2;
        }
        if(c%2==0)
        return true;
        else
        return false;
    }

//Armstrong number 

    public boolean armnum(int n)
    {
        int m=n,c=0;
        while(m!=0)
        {
            m/=10;
            c++;
        }
        m=n;
        int s=0;
        while(m!=0)
        {
            s+=(int)Math.pow(m%10,c);
            m/=10;
        }
        if(s==n)
        return true;
        else
        return false;
    }
    
//Pronic number

    public boolean pronicnum(int n)
    {
        for(int i=1;i<n;i++)
        {
            if ((i*(i+1))==n)
            {
               return true;
            }
        }
        return false;
    }
    
//Smith numbers

    public int sumOfDigits (int n)
    {
        int s=0;
        while(n!=0)
        {
            s+=(n%10);
            n/=10;
        }
        return s;
    }
    public boolean isComposite(int n)
    {
        for(int i=2;i<n;i++)
        if(n%i==0)
        return true;
        return false;
    }
    public boolean smith(int n)
    {
        int m=n,s=0,c=2;
        while(m!=1)
        {
            if(m%c==0)
            {
                s+=sumOfDigits(c);
                m/=c;
            }
            else
            c++;
        }
        if(sumOfDigits(n)==s)
        return true;
        else
        return false;
    }
    
//Dudeney numbers

     public boolean dudeney(int n)
     {
         int m=n,s=0;
         while(m!=0)
         {
             s+=(m%10);
             m/=10;
         }
         if((s*s*s)==n)
         return true;
         else
         return false;
     }
     
//Bouncy number 

    public boolean bouncy(int n)
    {
        int prev=2;//dummy number
        while(n>9)
        {
            int d=((n/10)%10)-(n%10);
            d=(d==0)?0:((d<0)?-1:1);
            if((prev!=2) && ((d!=0) && (prev!=0) && (d!=prev)))
            return true;
            prev=d;
            n/=10;
        }
        return false;
    }
    
//Abundant numbers 

    public boolean abundant(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            s+=i;
        }
        if(s>n)
        return true;
        else
        return false;
    }
    
//Spy number

    public boolean spy(int n)
    {
        int m=n,s=0,p=1;
        while(m!=0)
        {
            s+=(m%10);
            p*=(m%10);
            m/=10;
        }
        if(s==p)
        return true;
        else
        return false;
    }
    
//Prime palindrome number

    public boolean prime(int n)
    {
        for(int i=2;i<n;i++)
        if(n%i==0)
        return false;
        return true;
    }
    public boolean palindrome(int n)
    {
        int p=0,m=n;
        while(m!=0)
        {
            p=p*10+(m%10);
            m/=10;
        }
        if(p==n)
        return true;
        else
        return false;
    }
    public static void main (String args[])
    {
        PrimePalin obj=new PrimePalin();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower boundary value");
        int a = sc.nextInt();
        System.out.println("Enter the upper boundary value");
        int b = sc.nextInt();
        if(b<a)
        System.out.println("Invalid output");
        else
       {
           for(int i=a; i<=b; i++)
           {
              System.out.println(i);
           }
       }
    }
}*/