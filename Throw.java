public class ATM{
    double balance=1000;
    public void withdraw(double amount) throws Exception{
        if(amount>balance)
        {
            throw new Exception();
        }
        else{
            balance-=amount;
            System.out.println("withdraw: " + amount + "newbalance" + balance);
        }
    }
    public static void main(String[] args) {
        ATM obj=new ATM();
        try{
            obj.withdraw(1500);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}

