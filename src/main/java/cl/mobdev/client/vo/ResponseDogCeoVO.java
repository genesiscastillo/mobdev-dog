package cl.mobdev.client.vo;

import java.util.ArrayList;
import java.util.List;

public class ResponseDogCeoVO {

	private List<String> message = new ArrayList<>();
	
	private String status;

	public List<String> getMessage() {
		return message;
	}

	public void setMessage(List<String> message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ResponseDogCeoVO [message=" + message + ", status=" + status + "]";
	}
}