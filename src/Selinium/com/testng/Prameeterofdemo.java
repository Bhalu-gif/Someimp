package Selinium.com.testng;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prameeterofdemo 
{
@Parameters ("suite-param")
@Test
public void parametermethod1(String param)
{
	System.out.println("test of first method is: "+ param);
}
@Parameters ("test-two-param")
@Test
public void parametermethod2(String param)
{
	System.out.println("test of second method is: "+ param);

}
@Parameters({ "suite-param", "test-three-param" })
@Test
public void prameterTestThree(String param, String paramTwo)
{
    System.out.println("Test three suite param is: " + param);
    System.out.println("Test three param is: " + paramTwo);
	
}
}
