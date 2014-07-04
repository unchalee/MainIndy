package selectReceipt;

import fillRegisterProfile.Register;

public class Receipt {
	private String receiptDate;
	private String receiptName;
	private String receiptAddressNo;
	private String receiptStreet;
	private String receiptSubDistrict;
	private String receiptDistrict;
	private String receiptProvince;
	private String receiptZipcode;
	
	private Register register;
	
	public Receipt() {
		
	}

	public Receipt(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	
	public String getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(String receiptDate) {
		this.receiptDate = receiptDate;
	}
	
	public String getReceiptName() {
		return receiptName;
	}
	public void setReceiptName(String receiptName) {
		this.receiptName = receiptName;
	}

	public String getReceiptAddressNo() {
		return receiptAddressNo;
	}
	public void setReceiptAddressNo(String receiptAddressNo) {
		this.receiptAddressNo = receiptAddressNo;
	}

	public String getReceiptStreet() {
		return receiptStreet;
	}
	public void setReceiptStreet(String receiptStreet) {
		this.receiptStreet = receiptStreet;
	}

	public String getReceiptSubDistrict() {
		return receiptSubDistrict;
	}
	public void setReceiptSubDistrict(String receiptSubDistrict) {
		this.receiptSubDistrict = receiptSubDistrict;
	}

	public String getReceiptDistrict() {
		return receiptDistrict;
	}
	public void setReceiptDistrict(String receiptDistrict) {
		this.receiptDistrict = receiptDistrict;
	}

	public String getReceiptProvince() {
		return receiptProvince;
	}
	public void setReceiptProvince(String receiptProvince) {
		this.receiptProvince = receiptProvince;
	}

	public String getReceiptZipcode() {
		return receiptZipcode;
	}
	public void setReceiptZipcode(String receiptZipcode) {
		this.receiptZipcode = receiptZipcode;
	}

	public Register getRegister() {
		return register;
	}
	public void setRegister(Register register) {
		this.register = register;
	}
	
	public void addRegister(Register register){
		this.setRegister(register);
	}

	public void editReceipt(String receiptName, String receiptAddressNo,
			String receiptStreet, String receiptSubDistrict,
			String receiptDistrict, String receiptProvince,
			String receiptZipcode) {
		this.setReceiptName(receiptName);
		this.setReceiptAddressNo(receiptAddressNo);
		this.setReceiptStreet(receiptStreet);
		this.setReceiptSubDistrict(receiptSubDistrict);
		this.setReceiptDistrict(receiptDistrict);
		this.setReceiptProvince(receiptProvince);
		this.setReceiptZipcode(receiptZipcode);
	}
	
	public String toString() {
		return "วันที่ " + this.receiptDate + "\n" +
				"ได้รับเงินจาก\t" + receiptName + "\nที่อยู่\t"
				+ receiptAddressNo + " "+ receiptStreet
				+ " " + receiptSubDistrict
				+ " " + receiptDistrict + " "
				+ receiptProvince + " " + receiptZipcode 
				+ "\nรายการ : " + this.getRegister().getRegisterNo()
				+ "\nค่าเข้าร่วมอบรม : " + this.getRegister().getCourseRegisterCosts() + "\t(ราคาไม่รวมภาษี)";
	}
}
