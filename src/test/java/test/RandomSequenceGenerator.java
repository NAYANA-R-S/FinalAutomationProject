package test;
import java.util.Random;

public class RandomSequenceGenerator extends Baseclass{
	
	
	public static String randomMail(int length) {
	    String alphanumericCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuv";
	    StringBuffer randomString = new StringBuffer(length);
	    Random random = new Random();
	 
	    for (int i = 0; i < length; i++) {
	        int randomIndex = random.nextInt(alphanumericCharacters.length());
	        char randomChar = alphanumericCharacters.charAt(randomIndex);
	        randomString.append(randomChar);
	    }
	 
	    return "mel.brooks+"+randomString.toString()+"@gmail.com";
	}
	

}
