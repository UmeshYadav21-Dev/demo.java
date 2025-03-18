package in.ashotit;

public class Customer {
	
	private Integer cid;
	private String cnarme;
	private String cemail;
	
	public Customer() {
		
	}
	public Customer(Integer cid, String cnarme, String cemail) {
		super();
		this.cid = cid;
		this.cnarme = cnarme;
		this.cemail = cemail;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCnarme() {
		return cnarme;
	}
	public void setCnarme(String cnarme) {
		this.cnarme = cnarme;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cnarme=" + cnarme + ", cemail=" + cemail + "]";
	}
	

}
