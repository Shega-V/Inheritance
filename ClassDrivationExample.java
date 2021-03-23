/*
 * 
 */
package classdrivationexample;

/**
 *
 * @author shegavala
 */
public class ClassDrivationExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GenericItem miscItem = new GenericItem();
        ProduceItem oldItem = new ProduceItem();
        
        miscItem.setName("Turkey bacon");
        miscItem.setQuantity(9);
        miscItem.printItem();
        
        oldItem.setName("Yogurt");
        oldItem.setQuantity(40);
        oldItem.setExpiration("Jan 5,2021");
        oldItem.printItem();
        
        System.out.println("Expires:  " + oldItem.getExpiration());
        
        
    }
    
    
    
}
