package in.ashotit;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverJsonToJavaObject {
	public static void main(String[] args) throws Exception{
		
		// json conversion to java object
		File f = new File("customer.json");
		ObjectMapper mapper = new ObjectMapper();
		Customer customer = mapper.readValue(f, Customer.class);
		 System.out.println(customer);
	}

}
