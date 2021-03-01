/**
 * Test 1 - OOP
 * @author Courtney Peacock
 * @date 17/02/2021
 * Book class uses author title and isbn
 */
public class Book {
    private String Author;
    private String Title;
    private String Isbn;
    
    public Book() {
    	
    }
    
    public Book(String author, String title, String isbn) {
		Author = author;
		Title = title;
		Isbn = isbn;
    
    }
    
	@Override
	public String toString() {
		return Title + "," + Author + "," + Isbn;
	
	}

	/**
	 * @return the Author
	 */
	public String getAuthor() {
		return Author;
	}

	/**
	 * @param Author the Author to set
	 */
	public void setAuthor(String Author) {
		this.Author = Author;
	}

	/**
	 * @return the Title
	 */
	public String getTitle() {
		return Title;
	}

	/**
	 * @param Title the Title to set
	 */
	public void setTitle(String Title) {
		this.Title = Title;
	}

	/**
	 * @return the Isbn
	 */
	public String getIsbn() {
		return Isbn;
	}

	/**
	 * @param Isbn the Isbn to set
	 */
	public void setIsbn(String Isbn) {
		this.Isbn = Isbn;
	}
	
}