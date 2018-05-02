
package store;


public class Data 
{
    public String item;
    public double price;
    
    public Data()
    {
        item = "";
        price = 0.0;
    }
    
    public Data (String n, Double p)
    {
        item = n;
        price = p;     
        
    }
    public void setitem(String n)
    {
        item = n;
    }
    public void setprice(Double p)
    {
        price = p;
    }
    
    public String getitem()
    {
        return item;
    }
    public Double getprice()
    {
        return price;
    }
    public boolean isExpensive()
    {
      if (price > 10.99)
          return true;
      else 
          return false;
          
    }       

    
}
