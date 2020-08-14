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
public class DiscountByAmount extends Discount {

    @Override
    public void processDiscount(double amount,double value) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
        double val = amount-value;
        System.out.println("Congratulation you got discount of $"+value+" your total is $"+val);
         
    }
    
}
