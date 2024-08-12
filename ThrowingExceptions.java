public class ThrowingExceptions {

    protected double balance;

    public ThrowingExceptions(double balance) {
        this.balance = balance;
    }


    void deposit(double amount)
    {
        balance +=amount;
    }
    void withdraw(double amount) throws InsufficientFundsException
    {

            if (amount > balance) throw new InsufficientFundsException("Insufficient Funds ");
        }

    public static void main(String[] args) {
        ThrowingExceptions a1 = new ThrowingExceptions(300);
        a1.deposit(400);
        try
        {
            a1.withdraw(1000);
        }catch(InsufficientFundsException e)
        {
            System.out.println(e.getCause());
        }
    }
    }


