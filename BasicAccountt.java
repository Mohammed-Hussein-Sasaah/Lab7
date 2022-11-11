/*2. Implement a subclass of BankAccount called BasicAccount whose withdraw
method charges a penalty of $30 for each withdrawal that results in an
overdraft.*/

public class  BasicAccountt extends BankAccount  {
    private double withdraw;

    public BasicAccountt(double withdraw) {
        this.withdraw = withdraw;
    }

    int withdrawchecking=0;
    public double withdraw(){
        withdrawchecking++;
        System.out.println("The withdraw you have : ");
        if  (balance >= withdraw  ) {
            if (withdrawchecking < 3)
                return withdraw;
            else
                return (withdraw - 30);
        } else

            return 0;

    }
}