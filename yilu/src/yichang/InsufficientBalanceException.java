package yichang;

public class InsufficientBalanceException extends RuntimeException{
	public InsufficientBalanceException() {
		
	}
	public InsufficientBalanceException(String Message) {
		super(Message);
	}
}
