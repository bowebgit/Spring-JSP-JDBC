package template.model;

//import com.fasterxml.jackson.annotation.JsonView;
import java.util.List;

import template.jsonview.Views;

public class AjaxResponseBody {

	//@JsonView(Views.Public.class)
	String msg;

	//@JsonView(Views.Public.class)
	String code;

	//@JsonView(Views.Public.class)
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