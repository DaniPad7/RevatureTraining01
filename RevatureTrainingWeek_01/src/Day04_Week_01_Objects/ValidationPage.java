package Day04_Week_01_Objects;

public class ValidationPage {
	
	
	//Create a Custom Checked exception if the entered DL is valid or not.
	public boolean isValidDLN(String Dln) throws InvalidDLNException{
		if (!Dln.matches("[0-9]{9}")) {
			throw new InvalidDLNException("The DLN: " + Dln + " is invalid.");
			
		}
		return true;
		}

	
	//Create a Custom Unchecked exception for checking if the entered Passport number is valid or not java_examples\exceptions_demo\src\custom_demo
	public boolean isValidPassportNum(String passport) throws PassportNumException {
		if (!passport.matches("[A-Za-z0-9]{44}")) {
			throw new PassportNumException("The Passport number: " + passport + " is invalid.");
		}
		return true;
	}






}
