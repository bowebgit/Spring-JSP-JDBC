package template.controller;

import java.util.ArrayList; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import template.model.AjaxResponseBody;
import template.model.Book;

@RestController
public class AjaxController {
	
	
	@RequestMapping(value = "/search/api/getSearchResult")
	public AjaxResponseBody getSearchResultViaAjax() { 
		// obtain search criteria 
		String search = "";
		if(isValidSearchCriteria(search)) {
			//
		}
		
		AjaxResponseBody result = new AjaxResponseBody();
		ArrayList<Book> books = new ArrayList<Book>();
		
		Book book = new Book();
		book.setBook_title("Wow Title");
		book.setBook_author_first("Sal");
		book.setBook_author_last("Deez");
		book.setBook_price(1249);
		books.add(book);
		
		result.setCode("209");
		result.setMsg("kkk");	
		result.setResult(books);	
		
		return result;
	}

	
	private boolean isValidSearchCriteria(String search) {
		return true;
	}


}
