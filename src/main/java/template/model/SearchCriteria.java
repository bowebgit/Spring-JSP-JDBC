package template.model;

// @RequestBody converts the json data into this object
public class SearchCriteria {

	String book_title;
	String book_price;
	
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String title) {
		this.book_title = title;
	}
	public String getBook_price() {
		return book_price;
	}
	public void setBook_price(String price) {
		this.book_price = price;
	}


}