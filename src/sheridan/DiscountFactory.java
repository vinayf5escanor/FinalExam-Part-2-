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
public class DiscountFactory {
    private static DiscountFactory instance = null;
    
    private DiscountFactory( ) {
        
    }
    public Discount getDiscount( DiscountType type ) {
        switch ( type ) {
            case PERCENTAGE : return new DiscountByPercentage( );
            case AMOUNT : return new DiscountByAmount( );
        }
        return null;
    }
    
    public static DiscountFactory getInstance( ) {
        if ( instance == null ) {
            instance = new DiscountFactory( );
        }
        return instance;
    }
}
