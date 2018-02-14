// Object sent back to ajax request

package template.model;

import java.util.List;

public class AjaxResponseBody {

	String msg;

	String code;

	List<Book> result;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Book> getResult() {
		return result;
	}

	public void setResult(List<Book> result) {
		this.result = result;
	}

	
}