package bai_thi.utils;

public class AccountInvalidException extends Exception {
    public AccountInvalidException() {
    }

    public AccountInvalidException(String message) {
        super(message);
    }
}
