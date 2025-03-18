package in.ashotit;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjectToJson {
	public static void main(String[] args) throws Exception {
		Customer c = new Customer(101,"John","john@gmail.com");
		Customer c1 = new Customer(102,"smith","smith@gmail.com");
		
		// convert obj to json format
		
	  	ObjectMapper mapper = new ObjectMapper();
	  	mapper.writeValue(new File("customer.json"), c);
	  	mapper.writeValue(new File("customer.json"), c1);
	  	
	  	System.out.println("completed....!!");
	}

}
