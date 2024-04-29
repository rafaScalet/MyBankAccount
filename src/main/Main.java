package main;

import account.account;

public class Main {
    public static void main(String[] args){
        account acc = new account();

        acc.id = 1;
        acc.name = "nome";
        acc.balance = 10000;
        acc.cap = 100;

        System.out.println(acc.pop(100) ? "o saque foi efetuado, valor da conta: " + acc.balance : "erro ao realizar o saque");
        System.out.println("Depósito: " + acc.deposit(100));
        System.out.println(acc.transfer(acc, 100) ? "a transferência foi efetuada com sucesso" : "a transferência não foi concluída");
    }
}
