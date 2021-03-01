/**
 * Test 1 - OOP
 * @author Courtney Peacock
 * @date 17/02/2021
 * LibraryBook abstract class extends book and implements comparable librarybook uses callnumber
 */
public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    private String CallNumber;
    
    LibraryBook(String author, String title, String isbn, String callNumber) {
		super(author, title, isbn);
		CallNumber = callNumber;
    }
    
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    
    
    /* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
    public int compareTo(LibraryBook b) {
		return CallNumber.compareTo(b.getCallNumber());
	}

	/* (non-Javadoc)
	 * @see Book#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "," + CallNumber +
			circulationStatus();
	}
	
	/**
	 * @return the callNumber
	 */
    public String getCallNumber() {
    	return CallNumber;
    	
    }
    
    /**
	 * @param callNumber the callNumber to set
	 */
    public void setCallNumber(String callNumber){
		CallNumber = callNumber;
	}
    
   
}