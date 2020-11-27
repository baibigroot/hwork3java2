package com.company;

public class Main {

    public static void main(String[] args) throws LimitExeption {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit( 20000);
        while (true){
            try {
                bankAccount.withdrow(6000); // жестокое ограбление
            } catch (LimitExeption limitExeption)  {// мусора кот-е ловят преступников
                limitExeption.printStackTrace(); // это следователь, кот-й грит где произошло преступление
                bankAccount.withdrow((int) bankAccount.getAmound());
                break;
            }

        }
    }
}
