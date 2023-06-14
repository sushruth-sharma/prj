package com.dxc.model;

public class SellerCredential {

	private String selleremail;
	private String sellerpassword;
	public SellerCredential() {
		super();
	}
	public SellerCredential(String selleremail, String sellerpassword) {
		super();
		this.selleremail = selleremail;
		this.sellerpassword = sellerpassword; 
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
	@Override
	public String toString() {
		return "SellerCredential [selleremail=" + selleremail + ", sellerpassword=" + sellerpassword + "]";
	}
	
}
