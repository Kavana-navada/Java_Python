import java.util.Scanner;
public class f1
{
    int ans;
    int fact(int n){
        //int i=1;
        
        if(n==1)
        {
            return n;
        }
        else
        {
            ans=n*fact(n-1);
            return ans;
        }
        // while(i<=n)
        // {
        //     ans=ans*i;
        //     i++;
        // }
        // return ans;
        
    }
    public static void main(String args[])
    {
        f1 f=new f1();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter for which no u want to find factorial?");
        int n=sc.nextInt();
        if(n>=1)
        {
            int factorial=f.fact(n);
            System.out.println("factorial of "+n+"is ="+factorial);

        }
        else
        {
            System.out.println("invalid");
        }
        

    }
}