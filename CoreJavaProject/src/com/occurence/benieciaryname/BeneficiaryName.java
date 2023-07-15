package com.occurence.benieciaryname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeneficiaryName {
	 public static void main(String[] args) {
	        String beneficiaryName = "John.Doe";
	        boolean isValid = validateBeneficiaryName(beneficiaryName);
	        System.out.println("Is beneficiary name valid? " + isValid);
	    }

	    public static boolean validateBeneficiaryName(String beneficiaryName) {
	        // Regular expression pattern to match the beneficiary name
	        String pattern = "^[a-zA-Z]+\\.[a-zA-Z]+$";
	        // Create a Pattern object
	        Pattern regex = Pattern.compile(pattern);

	        // Create a Matcher object
	        Matcher matcher = regex.matcher(beneficiaryName);

	        // Check if the beneficiary name matches the pattern
	        return matcher.matches();
	    }
}
