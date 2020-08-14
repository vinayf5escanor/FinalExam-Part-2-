/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

/**
 *
 * @author VINAY
 */
public class DiscountByPercentage extends Discount {

    @Override
    public void processDiscount(double amount,double value) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double val1=(amount/100)*value;;
        double val = amount-(amount/100)*value;
          System.out.println("Congratulation you got discount of $"+val1+" your total is $"+val);
    }
    
}
