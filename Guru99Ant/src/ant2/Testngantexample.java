package ant2;

import java.util.Date;
import org.testng.annotations.*;

import org.testng.annotations.*;
public class Testngantexample {				
@Test
	public void Guru99AntTestNGMethod(){					     
	//	System.out.println("HELLO GURU99 ANT PROGRAM");		
		System.out.println("HELLO honey");	
		System.out.println("TODAY's DATE IS->"+ currentDate() );					
	}		
	public static String currentDate(){					
		return new Date().toString();					
	}		
}	
