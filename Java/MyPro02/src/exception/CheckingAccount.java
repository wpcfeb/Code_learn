package exception;
 
public class CheckingAccount extends Account {
 
    private double overdraftProtection;
 
    public CheckingAccount(double balance) {
        super(balance);
    }
 
    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
 
        this.overdraftProtection = overdraftProtection;
    }
 
    public void withdraw(double amt) throws OverDraftException {
        if (amt > this.balance + overdraftProtection) {
            double deficit = amt - (this.balance + overdraftProtection);
            throw new OverDraftException("͸֧��ȳ���", deficit);
        }
        this.balance -= amt;
    }
 
    public static void main(String[] args) {
        //��������1000�飬ӵ��500��͸֧���
        CheckingAccount a = new CheckingAccount(1000, 500);
        //����1000
        a.deposit(1000);
        //��ѯ���
        System.out.println(a.getBalance());
        try {
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
        } catch (OverDraftException e) {
            System.err.println("͸֧����:"+e.getDeficit());
            e.printStackTrace();
        }
 
    }
 
}