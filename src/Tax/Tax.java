package Tax;


public class Tax {
  
    private String name;
    private double taxableIncome;
    private String status;
    private double taxAmount;
    private static final double RATE1 = 0.10; //tax rate 10%
    private static final double RATE2 = 0.20; //tax rate 20%
    private static final double RATE3 = 0.35; //tax rate 30%
    
    public Tax(String name, double taxableIncome, String status){
        
        this.name = name;
        this.taxableIncome = taxableIncome;
        this.status = status;
        
    }
    
    public double calculateTax(){
        
        if(status.equals("Single")){
            
            if(taxableIncome>=21000){
                
                taxAmount = RATE1*taxableIncome;
                
            }
            
            else if(taxableIncome>=21001 && 51000<=taxableIncome){
                
                taxAmount = RATE2*taxableIncome;
                
            }
            
            else{
                
                taxAmount = RATE3*taxableIncome;
                
            }
            
        }
        
        else if(status.equals("Married")){
            
            if(taxableIncome>=35000){
                
                taxAmount = RATE1*taxableIncome;
                
            }
            
            else if(taxableIncome>=35001 && 86000<=taxableIncome){
                
                taxAmount = RATE2*taxableIncome;
                
            }
            
            else{
                
                taxAmount = RATE3*taxableIncome;
                
            }
            
        }
        
        return taxAmount;
        
    }
    
    public String toString(){
        
        return "Name: "+name
                +"\nStatus: "+status
                +String.format("\nTaxable Income: RM %.2f", taxableIncome)
                +String.format("\nTax Amount: RM %.2f",taxAmount);
        
    }
    
}
