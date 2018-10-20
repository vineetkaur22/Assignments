import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.*;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(CheckoutTest.class, DessertShoppeTest.class, CandyTest.class, SundaeTest.class, CookieTest.class, IcecreamTest.class);
		
      Boolean testFailed = false;
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
         testFailed = true;
      }
      if(!testFailed)
    	  		System.out.println("All Results for DessertShoppe were successful " + result.wasSuccessful());

      Result resultSpiral = JUnitCore.runClasses(SpiralTest.class);
      testFailed = false;
      for (Failure failure : resultSpiral.getFailures()) {
         System.out.println(failure.toString());
         testFailed = true;
      }
      if(!testFailed)
    	  		System.out.println("Spiral Test was successful " + result.wasSuccessful());

   
   }
}  	
