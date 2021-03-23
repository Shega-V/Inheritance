/*
 *
 */
package classdrivationexample;

/**
 *
 * @author shegavala
 */
class ProduceItem extends GenericItem {
    
    private String expirationDate;

    public void setExpiration(String expireDate) {
      expirationDate = expireDate;
    }

    public String getExpiration() {
      return expirationDate;
    }  
    
}
