
public class DatabaseTotals
{
    private int  totalItemsPurchased, totalItemsSold, totalFlowerCount, totalItemsAdded, totalFlowerNameCount, totalOnHand;
    private double  totalSalesProfit, totalRetailSales, totalTaxesCollected, totalWholesaleValue, salesTaxRate;

    //This is the constructor for DatabaseTotals//
    public DatabaseTotals() {
        this.totalItemsPurchased = 0;
        this.totalItemsSold = 0;
       
        this.totalFlowerCount = 0;
        this.totalItemsAdded = 0;
        this.totalFlowerNameCount = 0;
        this.totalOnHand = 0;
        this.totalSalesProfit = 0.0;
        this.totalRetailSales = 0.0;
        this.totalTaxesCollected = 0.0;
        this.totalWholesaleValue = 0.0;
        this.salesTaxRate = 0.0;
    }

    
    //get statements//

    public int getTotalItemsSold() {
        return totalItemsSold;
    }
    
    public int getTotalFlowerCount() {
        return totalFlowerCount;
    }
     
    public double getSalesTaxRate() {
        return salesTaxRate;
    }
    
    
    public int getTotalItemsAdded() {
        return totalItemsAdded;
    }

    public int getTotalItemsPurchased() {
        return totalItemsPurchased;
    }
    
    public int getTotalFlowerNameCount() {
        return totalFlowerNameCount;
    }   
    
    public int getTotalOnHand() {
        return totalOnHand;
    }


    public double getTotalRetailSales() {
        return totalRetailSales;
    }
    
    public double getTotalWholesaleValue() {
        return totalWholesaleValue;
    }
    
    public double getTotalTaxesCollected() {
        return totalTaxesCollected;
    }

    public double getTotalSalesProfit() {
        return totalSalesProfit;
    }

    //put statements//

    public void putTotalRetailSales(double totalRetailSales) {
        this.totalRetailSales = totalRetailSales;
    }

    public void putTotalTaxesCollected(double totalTaxesCollected) {
        this.totalTaxesCollected = totalTaxesCollected;
    }

    public void putTotalItemsSold(int totalItemsSold) {
        this.totalItemsSold = totalItemsSold;
    }

    public void putTotalItemsAdded(int totalItemsAdded) {
        this.totalItemsAdded = totalItemsAdded;
    }

    public void putTotalItemsPurchased(int totalItemsPurchased) {
        this.totalItemsPurchased = totalItemsPurchased;
    }

        public void putTotalSalesProfit(double totalSalesProfit) {
        this.totalSalesProfit = totalSalesProfit;
    }

    public void putSalesTaxRate(double salesTaxRate) {
        this.salesTaxRate = salesTaxRate;
    }
    
    public void putTotalFlowerNameCount(int totalFlowerNameCount) {
        this.totalFlowerNameCount = totalFlowerNameCount;
    }

    public void putTotalFlowerCount(int totalFlowerCount) {
        this.totalFlowerCount = totalFlowerCount;
    }
    
    public void putTotalOnHand(int totalOnHand) {
        this.totalOnHand = totalOnHand;
    }

    public void putTotalWholesaleValue(double totalWholesaleValue) {
        this.totalWholesaleValue = totalWholesaleValue;
    }


}
