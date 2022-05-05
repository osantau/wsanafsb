package oct.soft;

public class CompanyReqInfo {
	
	private Long cui;
	
	private String data;

	public CompanyReqInfo() {
		
	}

	public CompanyReqInfo(Long cui, String data) {

		this.cui = cui;
		this.data = data;
	}

	// Getter Methods

	public Long getCui() {
		return cui;
	}

	public String getData() {
		return data;
	}

	// Setter Methods

	public void setCui(Long cui) {
		this.cui = cui;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "CompanyReqInfo [cui=" + cui + ", data=" + data + "]";
	}

}