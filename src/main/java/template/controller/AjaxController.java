package template.controller;

import java.util.ArrayList; 

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import template.jsonview.Views;
import template.model.AjaxResponseBody;
import template.model.Book;
import template.model.SearchCriteria;

@RestController
public class AjaxController {
	
	// @JsonView(Views.Public.class)
	@RequestMapping(value = "/search/api/getSearchResult")
	public AjaxResponseBody getSearchResultViaAjax(@RequestBody SearchCriteria search) {
		System.out.println("**********");
		AjaxResponseBody result = new AjaxResponseBody();
		ArrayList<Book> books = new ArrayList<Book>();
		
		Book book = new Book();
		book.setBook_title("Wow Title");
		book.setBook_author_first("Sal");
		book.setBook_author_last("Deez");
		book.setBook_price(1249);
		books.add(book);
		
		
		result.setCode("200");
		result.setMsg("");	
		result.setResult(books);	
		
//		System.out.println(search.getBook_price() + " " + search.getBook_title());
//		
//		if(isValidSearchCriteria(search)) {
//			
//			if(books.size() > 0 ) {
//				result.setCode("200");
//				result.setMsg("");	
//				result.setResult(books);
//			} else {
//				result.setCode("204");
//				result.setMsg("no book!?");
//			}
//
//		} else {
//			result.setCode("404");
//			result.setMsg("wtf?");
//		}
		
		// AjaxResponseBody will be converted into json format and sent back to the request.
		return result;
		

	}

	private boolean isValidSearchCriteria(SearchCriteria search) {
		if(!search.equals(null)) {
			return true;
		}
		return false;
	}


}
