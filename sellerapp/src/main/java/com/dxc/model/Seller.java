package com.dxc.model;
import javax.persistence.*;

@Entity
@Table(name="REGD_SELLERS")
public class Seller {
	@Id
	public Boolean sellerid;
	public String sellername;
	private String selleremail;
	private String sellerpassword;
	public long sellerphone;
	public String selleraddress;
	public Seller() {
		super();
	}
	
	public Seller(Boolean sellerid, String sellername, String selleremail, String sellerpassword, long sellerphone,
			String selleraddress) {
		super();
		this.sellerid = sellerid; 
		this.sellername = sellername;
		this.selleremail = selleremail;
		this.sellerpassword = sellerpassword;
		this.sellerphone = sellerphone;
		this.selleraddress = selleraddress;
	}

	public Boolean getSellerid() {
		return sellerid;
	}
	public void setSellerid(Boolean sellerid) {
		this.sellerid = sellerid;
	}
	public String getSellername() {
		return sellername;
	}
	public void setSellername(String sellername) {
		this.sellername = sellername;
	}
	public String getSelleremail() {
		return selleremail;
	}
	public void setSelleremail(String selleremail) {
		this.selleremail = selleremail;
	}
	public String getSellerpassword() {
		return sellerpassword;
	}
	public void setSellerpassword(String sellerpassword) {
		this.sellerpassword = sellerpassword;
	}
	public long getSellerphone() {
		return sellerphone;
	}
	public void setSellerphone(long sellerphone) {
		this.sellerphone = sellerphone;
	}
	public String getSelleraddress() {
		return selleraddress;
	}
	public void setSelleraddress(String selleraddress) {
		this.selleraddress = selleraddress;
	}
	@Override
	public String toString() {
		return "Seller [sellerid=" + sellerid + ", sellername=" + sellername + ", selleremail=" + selleremail
				+ ", sellerpassword=" + sellerpassword + ", sellerphone=" + sellerphone + ", selleraddress="
				+ selleraddress + "]"; 
	}
	
	
}
