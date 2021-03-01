/**
 * Test 1 - OOP
 * @author Courtney Peacock
 * @date 17/02/2021
 * Library class with booklist array
 */
import java.util.ArrayList;
import java.util.Collections;

public class Library {
	ArrayList<LibraryBook> bookList;
  public Library () {
		bookList = new ArrayList<LibraryBook> ();
	}

	/**
	 * adds the given book to the library
	 * @param book
	 */
	public void addBook (LibraryBook book) {
		bookList.add(book);
	}

	/**
	 * prints all books in the library
	 */
	public void printLibrary () {
		System.out.println ("\nListing of books in the library\n");
		for (LibraryBook book: bookList)
			System.out.println (book);
		System.out.println ("End of book listing\n");
	}

	/**
	 * locates a book in the library
	 * @param book book being search in the library
	 * @return book object if book is found
	 *         null otherwise
	 */
	public LibraryBook findBook (LibraryBook book) {
		int index = Collections.binarySearch(bookList, book);
		if (index >= 0)
			return bookList.get(index);
		else
			return null;
	}

	/**
	 * sort books in the library by call number
	 */
	public void sortLibrary () {
		Collections.sort(bookList);
	}

	/**
	 * performs processing for checking a book out of the library
	 * @param patron  person checking out book
	 * @param dueDate date book is due to be returned
	 * @param callNum call number of book
	 */
	public void checkout (String patron, String dueDate, String callNum) {
		LibraryBook searchItem = new CirculatingBook ("", "", "", callNum);
		LibraryBook book = findBook(searchItem);
		if (book == null)
				System.out.println ("Book " + callNum + " not found -- checkout impossible\n");
		else
				book.checkout (patron, dueDate);
	}

	/**
	 * processes checked-out book that is being returned
	 * @param callNum call number of book being returned
	 */
	public void returned (String callNum) {
		LibraryBook searchItem = new CirculatingBook ("", "", "", callNum);
		LibraryBook book = findBook(searchItem);
		if (book == null)
			System.out.println ("Book " + callNum + " not found -- return impossible\n");
		else
			book.returned ();
	}
	
}