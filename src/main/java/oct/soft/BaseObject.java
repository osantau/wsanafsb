package oct.soft;

import java.util.ArrayList;
import java.util.List;

public class BaseObject {
	private int cod;
	private String message;
	private List<CompanyInfo> found = new ArrayList<CompanyInfo>();
	private List<CompanyInfo> notfound = new ArrayList<CompanyInfo>();

	// Getter Methods

	public int getCod() {
		return cod;
	}

	public String getMessage() {
		return message;
	}

	// Setter Methods

	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<CompanyInfo> getFound() {
		return found;
	}

	public void setFound(List<CompanyInfo> found) {
		this.found = found;
	}

	public List<CompanyInfo> getNotfound() {
		return notfound;
	}

	public void setNotfound(List<CompanyInfo> notfound) {
		this.notfound = notfound;
	}

	@Override
	public String toString() {
		return "BaseObject [cod=" + cod + ", message=" + message + ", found=" + found + ", notfound=" + notfound + "]";
	}
		
}
