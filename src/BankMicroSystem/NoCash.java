package BankMicroSystem;

import java.lang.Exception;
class NoCashException extends Exception {
    public NoCashException(){
        super("您的余额不足，无法取款！");
    }
}
