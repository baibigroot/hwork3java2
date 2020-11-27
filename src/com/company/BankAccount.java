package com.company;

public class BankAccount {

    private double amound;

    public double getAmound() {
        return amound;
    }

    public void deposit(double sum){
        System.out.println("Вы положили на счет" + sum);
        amound+=sum;

    }

    public void withdrow(int sum) throws LimitExeption {
        if (sum > amound){
            throw new LimitExeption("У вас не достаточно средств", sum);
        }
       else{
            amound=amound-sum;
            System.out.println("Операция прошла успешно, вы сняли со счета ..... "+sum);
            System.out.println("Ваш остаток на счете "+amound);

        }

    }
}
