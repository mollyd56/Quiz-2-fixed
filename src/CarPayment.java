
public class CarPayment {
	
	public CarPayment(double totalPrice, double downPayment, double lengthOfLoan, double interestRate) {
		super();
		this.totalPrice = totalPrice;
		this.downPayment = downPayment;
		this.lengthOfLoan = lengthOfLoan;
		this.interestRate = interestRate;
	}
	
	private double totalPrice;
	private double downPayment;
	private double lengthOfLoan;  
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getDownPayment() {
		return downPayment;
	}
	public void setDownPayment(double downPayment) {
		this.downPayment = downPayment;
	}
	public double getlengthOfLoan() {
		return lengthOfLoan;
	}
	public void setLengthOfLoan(double lengthOfLoan) {
		this.lengthOfLoan = lengthOfLoan;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	private double interestRate;
	
	public double CarPaymentMonthly(){
		double principal = getTotalPrice() - getDownPayment();
		double num = getInterestRate() / 12.0 * principal;
		double denom = 1.0 - Math.pow((getInterestRate() + 1 /12.0), (-1.0 * getlengthOfLoan())); 
		return num / denom;
	}

	public double TotalInterest()
	{
		double principal2 = getTotalPrice() - getDownPayment();
		return CarPaymentMonthly() * getlengthOfLoan() - (principal2);
	}

}