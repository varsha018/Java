package JAVAPatterns;

import java.net.MalformedURLException;
import java.net.URL;

public class URLVsIPCompare {

	public static void main(String[] args) throws MalformedURLException {
		// https://www.facebook.com >>>>157.240.247.35
		
		System.out.println(new URL("https://www.facebook.com/").equals(new URL("https://157.240.247.35")));
		System.out.println(new URL("https://www.google.com/").equals(new URL("https://172.217.168.196")));
	}

}
