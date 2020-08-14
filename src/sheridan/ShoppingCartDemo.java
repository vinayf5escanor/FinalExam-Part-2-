/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import sheridan.Product;
import sheridan.PaymentServiceType;
import sheridan.PaymentServiceFactory;
import sheridan.PaymentService;
import sheridan.Cart;

/**
 *
 * @author ramses
 */
public class ShoppingCartDemo {
    
    public static void main( String args [ ] ) {
        PaymentServiceFactory factory = PaymentServiceFactory.getInstance( );
        PaymentService creditService = factory.getPaymentService( PaymentServiceType.CREDIT );
        PaymentService debitService = factory.getPaymentService( PaymentServiceType.DEBIT );
        DiscountFactory factory1 = DiscountFactory.getInstance( );
        Discount amount = factory1.getDiscount( DiscountType.AMOUNT );
        Discount percentage = factory1.getDiscount( DiscountType.PERCENTAGE );     
            // create cart and add products
        Cart cart = new Cart( );
        cart.addProduct( new Product( "shirt" , 50 ) );
        cart.addProduct( new Product( "pants" , 60 ) );
            // set credit service and pay
      
        cart.setPaymentService( creditService );   
        cart.setDiscountType(amount);
        cart.payCart();
        cart.setDiscountType(amount);
        cart.getDiscount(10);
            // set debit service and pay
        cart.setPaymentService( debitService );
        cart.setDiscountType(percentage);
        cart.payCart();        
        cart.getDiscount(15);
        
        
        
        
    } 
    
}
