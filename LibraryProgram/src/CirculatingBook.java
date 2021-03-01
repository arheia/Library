/**
 * Test 1 - OOP
 * @author Courtney Peacock
 * @date 17/02/2021
 * CirculatingBook extends LibraryBook uses CurrentHolder and Duedate
 */
public class CirculatingBook extends LibraryBook {
	private String CurrentHolder;
	private String DueDate;
	
	public CirculatingBook(String author, String title,
				String isbn, String callNumber) {
		super(author, title, isbn, callNumber);
		CurrentHolder = DueDate = null;
	}
	
	@Override
	public void checkout(String patron, String due) {
		CurrentHolder = patron;
		DueDate = due;
	}
	
	/* (non-Javadoc)
	 * @see LibraryBook#returned()
	 */
	@Override
	public void returned() {
		CurrentHolder = DueDate = null;
	}

	/* (non-Javadoc)
	 * @see LibraryBook#circulationStatus()
	 */
	@Override
	public String circulationStatus() {
		if (CurrentHolder == null) {
			return "Book available on shelves";
		}
		return CurrentHolder + "," + DueDate;
	}

	/**
	 * @return the currentHolder
	 */
	public String getCurrentHolder() {
		return CurrentHolder;
		
	}
	
	/**
	 * @param currentHolder the currentHolder to set
	 */
	public void setCurrentHolder(String currentHolder) {
		CurrentHolder = currentHolder;
	}

	/**
	 * @return the dueDate
	 */
	public String getDueDate() {
		return DueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(String dueDate) {
		DueDate = dueDate;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
        String str = "| Title: " + getTitle() + " | Author: " + getAuthor() + " | ISBN: " + getIsbn() + " | Call Number: " + getCallNumber() + " | Status: " + circulationStatus();
        return str;
        
	}
	
}
