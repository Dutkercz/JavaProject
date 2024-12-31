package Anotacoes.EHP;

public class program {
    public static void main(String[] args) {


        Account acc1 = new BusinessAccount("Cris", 1001, 2500.00, 200.00 );
        acc1.withdraw(150);
        System.out.println(acc1.getBalance());
    }
}
