package Day04_Week_01_Objects;

public class PassportNumException extends RuntimeException{

	
	//Create a Custom Unchecked exception for checking if the entered Passport number is valid or not java_examples\exceptions_demo\src\custom_demo
	public PassportNumException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassportNumException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public PassportNumException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PassportNumException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PassportNumException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
