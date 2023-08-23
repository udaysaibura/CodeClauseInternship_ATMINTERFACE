import java.util.*;

class AtmInterface {
    public static void main(String[] args) {
        System.out.println("      WELCOME     ");
        Atm a=new Atm();
        int accno[]={505524,50123,501112,500001,542381};
        int pin[]={12673,12134,13562,43135,16139};
        int bal[]={90000,25000,65000,78000,43000};
        Scanner s=new Scanner(System.in);
        
            
        System.out.println("Enter the account number");
        int no=s.nextInt();
        int i=0;
        for( i=0;i<5;i++)
        {
            if(accno[i]==no)
            {
                break;
            }
        }
        if(i==5)
        {
            System.out.println("Entered Account Number is INNCORRECT   \n         TRY AGAIN");
            
        }
        else
        {
            System.out.println("Enter your pin");
            int p=s.nextInt();
            if(p==pin[i])
            {
                int b=0;
        while(b!=1)
        {
                System.out.println("Press 1:DEPOSIT ");
                System.out.println("Press 2:WITHDRAW");
                System.out.println("Press 3:CHECKBAL");
                System.out.println("PRESS 4:EXIT");
                int sw=s.nextInt();
                switch(sw)
                {
                    case 1:a.deposit(bal,i);
                    break;
                    case 2:a.withdraw(bal,i);
                    break;
                    case 3:a.checkbal(bal,i);
                    break;
                    default: System.out.println("VISIT AGAIN");
                    b=1;
                    break;
                }
               
            }
            }
            else
            {
                System.out.println("Entered pin is INCORRECT \n      TRY AGAIN");
               
            }
        }
        
        
    }
}
class Atm 
{
    Scanner s=new Scanner(System.in);
    void deposit(int bal[],int k)
    {
        System.out.println("Enter the amount to be deposited::");
        int amt=s.nextInt();
        bal[k]+=amt;
        System.out.println(bal[k]);
    }
    void  withdraw(int bal[],int k)
    {
        System.out.println("Enter the amount to be Withdraw::");
        int amt=s.nextInt();
        if(bal[k]-amt>=0)
        {
            bal[k]-=amt;
        System.out.println(bal[k]);
        }
        else
        {
        System.out.println("Insufficient balance");

        }
        
    }
    void checkbal(int bal[],int k)
    {
        System.out.println("Ur account balance is::"+bal[k]);
    }
}