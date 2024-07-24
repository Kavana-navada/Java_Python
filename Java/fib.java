import java.util.Scanner;

public class fib {
    int count=0;
    void fibo(int n)
    {
        while(count<n){
            int f1=0,f2=1,f3;
           
            if(n==1)
            {
                System.out.println(f1+" ");
                count=1;
            }  
            else if(n==2)
            {
                System.out.print(f1+" "+f2+" ");
                count=2;
            }
            else
            {
                System.out.print(f1+" "+f2+" ");
                count=2;
                while(count<n){
                    f3=f1+f2;
                    System.out.print(f3+" ");
                    f1=f2;
                    f2=f3;
                    count++;
                }
            }
        }
        
           
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib f=new fib();
        System.out.println("fib series is:");
        f.fibo(n);
    }
    
}
