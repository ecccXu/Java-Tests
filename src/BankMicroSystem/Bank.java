package BankMicroSystem;

import java.util.Scanner;

public class Bank {
    private float balance = 0.0f;//存款余额,初始化为 ¥0.00
    private float deposit;//需要存储的金额
    private float withdraw;//需要取出的金额
    public Bank(){}
    Scanner scan = new Scanner(System.in);
    public void deposite(){//存款操作
        System.out.print("请输入存款金额：¥");
        deposit = scan.nextFloat();
        if (deposit > 0) {
            balance += deposit;
            getbalawal();
        }
        else {
            System.out.println("error!");
        }
    }
    public void withdrawa() throws NoCashException{//取款操作
        getbalawal();
        System.out.print("请输入取款金额：¥");
        withdraw = scan.nextFloat();
        if (withdraw <= balance & withdraw > 0){
            balance -= withdraw;
            System.out.print("取款成功！");
            getbalawal();
        }
        else {
            throw new NoCashException();
        }
    }
    public void getbalawal(){//获取余额操作
        System.out.printf("账户余额¥ %.2f%n",balance);
    }
}