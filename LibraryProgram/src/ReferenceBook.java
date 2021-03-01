/**
 * Test 1 - OOP
 * @author Courtney Peacock
 * @date 17/02/2021
 * Referencebook extends librarybook using collection
 */
public class ReferenceBook extends LibraryBook {
	private String Collection;
	
	public ReferenceBook(String author, String title, String isbn, String callNumber, String collection) {
		super(author, title, isbn, callNumber);
		Collection = collection;
		
	}
	
	/* (non-Javadoc)
	 * @see LibraryBook#checkout()
	 */
	@Override
	public void checkout(String patron, String due) {
		System.err.println("Cannot check out a reference book");
		
	}
	
	/* (non-Javadoc)
	 * @see LibraryBook#returned()
	 */
	@Override
	public void returned() {
		System.err.println("Cannot return a reference book");
		
	}
	
	/* (non-Javadoc)
	 * @see LibraryBook#circulationStatus()
	 */
	@Override
	public String circulationStatus() {
		return "non-circulating reference book";
		
		
	}
	
	/* (non-Javadoc)
	 * @see LibraryBook#toString()
	 */
	@Override
	public String toString()
    {
        String str = "| Title: " + getTitle() + " | Author: " + getAuthor() + " | ISBN: " + getIsbn() + " | Call Number: " + getCallNumber() + " | Collection: " + Collection + " | Status: " + circulationStatus();
        return str;
        
    }
	
	/**
	 * 
	 * @return the Collection
	 */
	public String getCollection() {
		return Collection;
		
	}
	
	/**
	 * 
	 * @param Collection the Collection to set
	 */
	public void setCollection(String collection) {
		Collection = collection;
		
	}
	
}