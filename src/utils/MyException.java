package utils;

public class MyException extends Exception{
	private int i;
	private String message;
	
	public MyException(int i, String message) {
		super(message);
		this.i = i;
		this.message = message;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
