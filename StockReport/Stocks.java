package StockReport;

public class Stocks {
	
	String Stock_Name;
	Long Share_Price;
	Long No_of_Shares;
	
	public void setStock(String stockname) {
		this.Stock_Name = stockname;
	}

	public String getStock() {
		return Stock_Name;
	}
	
	public void setSharePrice(long shareprice) {
		this.Share_Price = shareprice;
	}

	public long getSharePrice() {
		return Share_Price;
	}
	
	public void setNoOfShares(long TotalShare) {
		this.No_of_Shares = TotalShare;
	}

	public long getNoOfShares() {
		return No_of_Shares;
	}
	
	public long shareValue() {
		long sharevalue = Share_Price * No_of_Shares;
		return sharevalue;
	}

	public long valueOfPortfolio() {
		long totalportfolio = this.shareValue() + this.shareValue();
		return totalportfolio;
	}
	
	@Override
	public String toString() {
		return "Stock_Name\t" + Stock_Name + "\n Share_Price\t" + Share_Price + "\n No_of_Shares\t" + No_of_Shares + "\n shareValue()\t" + shareValue() + "\n";
	}
}
