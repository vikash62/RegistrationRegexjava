package com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import com.bridgelabz.UserRegistration.RegexExpressionTest;

public class RegexExpressionTest {
	   @Test
	    public void givenFirstName_whenProper_ShouldReturnTrue() {
		   RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.firstNameValidate("Vikash");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.firstNameValidate("Vikash");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenLastName_whenProper_ShouldReturnTrue() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.lastNameValidate("Pathak");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenLastName_whenNotProper_ShouldReturnFalse() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.lastNameValidate("Pathak");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenEmail_whenProper_ShouldReturnTrue() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenEmail_whenNotProper_ShouldReturnFalse() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPhone_whenProper_ShouldReturnTrue() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("8709129634");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPhone_whenNotProper_ShouldReturnFalse() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("8709129634");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPassword_whenProper_ShouldReturnTrue() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPassword_whenNotProper_ShouldReturnFalse() {
	    	RegexExpression userRegistrationRegEx = new RegexExpression();
	        boolean result = userRegistrationRegEx.passwordValidate("vikash#%");
	        Assert.assertFalse(result);
	    }
}
