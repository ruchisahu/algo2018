/*Calculate the monthly payments if you take out a $principal loan for
 *  the specified number of years at the specified interest rate,
 *  where interested is compounded monthly.
 *
 *                  principal * rate
 *     payment =  -------------------      where n = 12 * years,
 *                1  - (1 + r)^(-n)              r = (rate / 100) / 12
 *
 *
 *  % java CarLoan 20000 5 6
 *  Monthly payments = 386.6560305885655
 *  Total interest   = 3199.361835313932      */

public class CarLoan
{
    public static void main(String[] args)
    {
       Double principle=Double.parseDouble(args[0]);
      Double years=Double.parseDouble(args[1]);
         double rate = Double.parseDouble(args[2]);
        
         
     //     Double principle=20000;
     //   Double years=5;
    //     double rate = 6;
         
         Double r=(rate/100)/12;
         
         double n=12 * years;
        // Double payment=(principle * rate)/(1-(1-r)^(-n));
         
         double payment  = (principle * r) / (1 - Math.pow(1+r, -n));
        double interest = payment * n - principle;
        
         System.out.println("Monthly payments = " + payment);
        System.out.println("Total interest   = " + interest);
    }
}