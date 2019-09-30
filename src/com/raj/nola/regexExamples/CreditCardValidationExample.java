package com.raj.nola.regexExamples;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardValidationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  System.out.print("Enter your credit card number in this format xxxx-xxxx-xxxx-xxxx : "); 
		  Scanner scanner = new Scanner(System. in); 
		  String cardNumber = scanner. nextLine();
		  scanner.close();


		String regex = "^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" + "(?<mastercard>5[1-5][0-9]{14})|"
				+ "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" + "(?<amex>3[47][0-9]{13})|"
				+ "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" + "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$";

		Pattern pattern = Pattern.compile(regex);

		cardNumber = cardNumber.replaceAll("-", "");

		Matcher matcher = pattern.matcher(cardNumber);

		if (matcher.matches()) {

			if (matcher.group("visa") != null) {

				System.out.println(" You have Entered a valid Visa Card Number");

			} else if (matcher.group("mastercard") != null) {

				System.out.println(" You have Entered a valid Mastercard Card Number");

			} else if (matcher.group("discover") != null) {

				System.out.println(" You have Entered a valid Discover Card Number");

			} else if (matcher.group("amex") != null) {

				System.out.println(" You have Entered a valid Amex Card Number");

			} else if (matcher.group("diners") != null) {

				System.out.println(" You have Entered a valid Diners Card Number");

			} else if (matcher.group("jcb") != null) {

				System.out.println(" You have Entered a valid JCB Card Number");

			}
		}

	}

}
