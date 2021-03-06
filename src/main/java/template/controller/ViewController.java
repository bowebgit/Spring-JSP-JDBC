package template.controller;
 
import java.util.ArrayList;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import template.action.ViewAction;
import template.model.Book;


@Controller
public class ViewController {

	

	@RequestMapping(value="/home")
	public String home(Model model, HttpServletRequest request){
		
		// ViewAction viewAction = new ViewAction();
		ArrayList<Book> books = new ArrayList<Book>();
		Book book = new Book();
		book.setBook_title("Famous Title");
		book.setBook_price(999);
		book.setBook_author_first("Joe");
		book.setBook_author_last("Blow");
		books.add(book);
		model.addAttribute("books", books);
		
		return "/home";
	}

	
}

