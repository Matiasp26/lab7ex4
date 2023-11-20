package com.company;
import java.util.Scanner;

class BankAccount{
    private int balance;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }
}

public class Main {
    static void deposit(BankAccount cont){
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("adaugati: ");
        x=s.nextInt();
        cont.setBalance(cont.getBalance()+x);
        show(cont);
    }

    static void show(BankAccount cont){
        System.out.println("Balanta este: "+cont.getBalance());
    }

    public static void main(String[] args) {
        BankAccount cont = new BankAccount();
        System.out.println("Balanta actuala"+cont.getBalance());
        deposit(cont);
    }
}
