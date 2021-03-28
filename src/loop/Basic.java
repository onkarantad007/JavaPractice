package loop;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n=0;
            boolean exit = false;

        while (!exit){
            System.out.println("-------------CHOICES------------");
            System.out.println("1 : Factorial loop");
            System.out.println("2 : Fibonacci number loop");
            System.out.println("3 : Prime or Not");
            System.out.println("4 : Palindrome");
            System.out.println("10 : exit" + "\n");



            System.out.print("enter choice : ");
            switch (sc.nextInt())
            {
                case 1:
                    System.out.println("============Factorial loop=============");
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    int fact =1;
                    for (int i=n ; i>=1 ; i--)
                        fact = fact * i;
                    System.out.println("factorial of " +  n + " is : " + fact);
                    System.out.println("=========================");
                    break;
                case 2:
                    System.out.println("===========Fibonacci number loop==============");
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    int a=0;
                    int b=1;
                    System.out.print(a+" ");
                    System.out.print(b+" ");
                    for (int i=0;i<n-2;i++){
                        int c = a  + b ;
                        System.out.print(c+ " ");
                        a=b;
                        b=c;
                    }
                    System.out.println("\n=========================");
                    break;
                case 3:
                    System.out.println("============Prime or Not=============");
                    boolean isPrime=true;
                    int count=0;
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    if(n<=1) isPrime=false;
                    for (int i=2 ; i*i<=n ;i++)
                     //for (int i=2 ; i<n ;i++)
                    {
                        count++;
                        if(n%i==0){
                            isPrime=false;
                            break;
                        }
                    }
                    System.out.println("isPrime : " + isPrime);
                    System.out.println("Count : " + count);
                    System.out.println("=========================");

                    // if number has no factor between 1 and sqRoot(number) then that is prime
                    //      i < sqroot(number)
                    //      i*i < number
                    break;
                case 4:
                    System.out.println("===========Palindrome==============");
                    boolean isPalindrome=false;
                    System.out.print("enter number : ");
                    n = sc.nextInt();
                    int temp=n;
                    int reverse=0;
                    while (temp>0){
                        int last = temp%10;
                        reverse=reverse*10+last;
                        temp=temp/10;
                    }
                    if(n==reverse){
                        isPalindrome=true;
                        System.out.println(n + " isPalindrome : " + isPalindrome);
                    }else
                    System.out.println(n + " isPalindrome : " + isPalindrome);
                    System.out.println("=========================");
                    break;
                case 5:
                    break;

                case 10:
                    System.out.println("program is terminated !!!");
                    exit=true;
                    break;

            } //switchEnd
        } // whileEnd

        } //tryEnd
        catch (Exception e){
            e.printStackTrace();
        } //catchEnd

    } // MainEnd
} //ClassEnd
