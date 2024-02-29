package opearators_arithmetics;

class Product{
	private String itemn;
	private String name;
	private double price;
	private int qty;
	
	public String getItemn() {
		return itemn;
	}
	public String getName() {
		return name;
	}
	public double getPrice(){
		return price;
	}
	public int getQty() {
		return qty;
	}
	public void setPrice(double p) {
		this.price=p;
	}
	public void setQty(int q) {
		this.qty=q;
	}
	public Product(String itemn) {
		this.itemn=itemn;
	}
	public Product(String itemn,String name) {
		itemn="i";
		this.name=name;
	}
	public Product(String itemn, String name, double p, int q) {
		this.itemn=itemn;
		this.name=name;
		setPrice(price);
		setQty(qty);
	}
}
class Customer{
	private String custid;
	private String name;
	private String add;
	private String pNo;
	
	public Customer(String cid, String name) {
		this.custid=cid;
		this.name=name;
	}
	public Customer(String cid, String name, String add, String pNo) {
		this.custid=cid;
		this.name=name;
		setAdd(add);
		setPhNo(pNo);
	}
	public String getCustid() {
		return custid;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public String getPhNo() {
		return pNo;
	}
	public void setAdd(String add) {
		this.add=add;
	}
	public void setPhNo(String pNo) {
		this.pNo=pNo;
	}
	public String Details() {
		return custid+ name+ add+ pNo;
	}
}

public class OOPS_PRO_CUST_117 {

	public static void main(String[] args) {
		
		

	}

}
