//Number Programs 

//Fascinating number

/*import java.util.*;
public class Facnumber
{
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
  public static void main(String args[])
  {
    Facnumber obj=new Facnumber();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the lower boundary value");
    int a = sc.nextInt();
    System.out.println("Enter the upper boundary value");
    int b = sc.nextInt();
    if(a<100 || b<a)
    System.out.println("Invalid output");
    else
    {
      for(int i=a; i<=b; i++)
      {
        if(obj.fascinating(i))
        System.out.println(i);
        }
    }
  }
}*/

//Evil number

/*import java.util.*;
public class Evilnumber
{
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
    public static void main (String args[])
    {
        Evilnumber obj=new Evilnumber();
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
              if(obj.evil(i))
              System.out.println(i);
              }
       }
    }
}*/

//Armstrong number 

/*import java.util.*;
public class Armstrong
{
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
    public static void main (String args[])
    {
        Armstrong obj=new Armstrong();
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
              if(obj.armnum(i))
              System.out.println(i);
              }
       }
    }
}*/

//Pronic number

/*import java.util.*;
public class Pronic
{
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
    public static void main (String args[])
    {
        Pronic obj=new Pronic();
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
              if(obj.pronicnum(i))
              System.out.println(i);
           }
       }
    }
}*/

//Smith numbers

/*import java.util.*;
public class Smithnum
{
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
    public static void main (String args[])
    {
        Smithnum obj=new Smithnum();
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
              if(obj.isComposite(i) && obj.smith(i))
              System.out.println(i);
           }
       }
    }
}*/

//Dudeney numbers

/*import java.util.*;
public class DudeNum
{
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
     public static void main (String args[])
    {
        DudeNum obj=new DudeNum();
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
              if(obj.dudeney(i))
              System.out.println(i);
           }
       }
    }
}*/

//Bouncy number 

/*import java.util.*;
public class Bouncynum
{
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
    public static void main (String args[])
    {
        Bouncynum obj=new Bouncynum();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the lower boundary value");
        int a = sc.nextInt();
        System.out.println("Enter the upper boundary value");
        int b = sc.nextInt();
        if(b<a || a<100)
        System.out.println("Invalid output");
        else
       {
           for(int i=a; i<=b; i++)
          {
              if(obj.bouncy(i))
              System.out.println(i);
           }
       }
    }
}*/

//Abundant numbers 

/*import java.util.*;
public class Abnum
{
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
    public static void main (String args[])
    {
        Abnum obj=new Abnum();
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
              if(obj.abundant(i))
              System.out.println(i);
           }
       }
    }
}*/

//Spy number

/*import java.util.*;
public class Spynum
{
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
    public static void main (String args[])
    {
        Spynum obj=new Spynum();
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
              if(obj.spy(i))
              System.out.println(i);
           }
       }
    }
}*/

//Prime palindrome number

/*import java.util.*;
public class PrimePalin
{
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
              if(obj.palindrome(i) && obj.prime(i))
              System.out.println(i);
           }
       }
    }
}*/