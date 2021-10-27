package com.revature.service;

// The service layer is responsible for the processing of data. We would perform business logic inside of the service layer.
// Ex. imagine you are developing the backend for facebook. The service layer of Facebook's backend would contain business logic related to providing friend
// recommendations, ad recommendations, etc. for a particular Facebook user.
// All sorts of complex algorithms could be developed, and those would ultimately be part of this "service" layer.
// Sometimes, the service layer will be pretty simple (especially for CRUD applications)
// CRUD = Create, Read, Update, Delete
// CRUD applications are applications that are primarily designed to keep records of data
public class ArithmeticService {

	public String doAddition(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		
		double addition = number1 + number2;

		String result = "" + addition;
			
			return result;
	}

	public String doSubtraction(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		
		double subtract = number1 - number2;

		String result = "" + subtract;
			
			return result;

	}

	public String doMultiplication(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double multiply = number1 * number2;

		String result = "" + multiply;

		return result;
	}

	public String doDivide(String number1String, String number2String) {
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);

		double divide = number1 / number2;

		String result = "" + divide;

		return result;

	}

}
