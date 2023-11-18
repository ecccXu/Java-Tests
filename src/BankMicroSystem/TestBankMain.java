package BankMicroSystem;

import java.util.Scanner;

public class TestBankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
        //菜单栏
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("---------[BANK]---------");
            System.out.println("- 1.显示当前余额         -");
            System.out.println("- 2.存款                -");
            System.out.println("- 3.取款                -");
            System.out.println("- 4.退出                -");
            System.out.println("---------[BANK]---------");
            System.out.print("请选择：");
            int choice = scan.nextInt();
            try {
                switch (choice) {
                    case 1:
                        bank.getbalawal();
                        break;
                    case 2:
                        bank.deposite();
                        break;
                    case 3:
                        bank.withdrawa();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("选择错误！");
                }
            }
            catch (NoCashException e){
                System.out.println(e.getMessage());
            }
            catch (Exception e){
                System.out.println("出现未知异常！");
            }
        }
    }
}
