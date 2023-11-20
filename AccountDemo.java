class Account{
    String account_number;
    double balance=0.0;
    Account(String a,double b){
        account_number=a;
        balance=b;
    }
    void Deposit(double amount){
        balance+=amount;
        System.out.println("After deposition balance becomes:"+balance);
    }
    void Withdraw(double amount){
        if(balance >= amount){
           balance-=amount;
           System.out.println("After withdrawal balance becomes:"+balance);
        }
        else
           System.out.println("Insufficient Balance");
    }
    void display(){
        System.out.println("Balance is:"+balance);
    }
}
class SavingsAccount extends Account{
    char overdraft_facility;
    double interest=0.0;
    SavingsAccount(String a,double b) {
    super(a, b); 
    overdraft_facility='N';
    balance=1000;
    System.out.println("Minimum savings balance account is:"+balance);
    }
    void Interest(double amount,double rate,double time){
        interest=(amount*rate*time)/100;
        System.out.println("Total Interest is:"+interest);
        balance+=interest;
        System.out.println("Total balance after added with interest is "+balance);
    }
}
class CurrentAccount extends Account{
    char overdraft_facility;
    double overdraft_limit;
    CurrentAccount(String a,double b){
        super(a, b);
        overdraft_facility='Y';
        overdraft_limit=100;
        System.out.println("Overdraft Limit is:"+overdraft_limit);
    }
    //overriding default Withdraw function
    void Withdraw(double amount){
        if(balance >= amount || (overdraft_facility=='Y' && (balance+overdraft_limit)>=amount)){
           balance-=amount;
           System.out.println("After withdrawal in Current account balance becomes:"+balance);
        }
        else
           System.out.println("Insufficient Balance/ Overdraft limit exceeded");
    }
}

class AccountDemo{
    public static void main(String args[]){
        Account a1=new Account("AW156893214",1000);
        a1.display();
        a1.Deposit(250);
        a1.Withdraw(750);
        SavingsAccount a2=new SavingsAccount("AW156893214",1000);
        a2.Interest(200.0,5.0,3.0);
        System.out.println("For Current account :");
        CurrentAccount a3=new CurrentAccount("A6543298710PQ",200);
        a3.Withdraw(280);
    }
}