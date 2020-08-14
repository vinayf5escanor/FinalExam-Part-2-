/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheridan;

import java.util.ArrayList;
import java.util.List;
import sheridan.PaymentService;
import sheridan.Product;

/**
 *
 * @author ramses
 */
public class Cart {
    
    private List <Product> products = new ArrayList<>( );
    private PaymentService service;
    private Discount discount;
    private double t=0;
    
    public void setPaymentService( PaymentService service ) {
        this.service  = service;
    }
    
    public void setDiscountType( Discount dis ) {
        this.discount  = dis;
    }
    
    public void getDiscount(double val){
        discount.processDiscount(t, val);
    }
    
    public void addProduct( Product product ) {
        products.add( product );
    }
    
    public void payCart( ) {
        double total = 0;
        
        
       for ( Product product : products ) {
           total += product.getPrice( );
       }
        service.processPayment( total );
        t=total;
    }
    public int getCartSize(){
        return (int)products.size();
    }
}
