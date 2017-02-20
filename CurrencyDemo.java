import java.util.*;

public class CurrencyDemo {

   public static void main(String args[]) {

   // create a currency object with specified currency code
   Currency curr = Currency.getInstance("USD");

   // print currency's code
   System.out.println("Currency code :" + curr.getCurrencyCode());
   }
}
