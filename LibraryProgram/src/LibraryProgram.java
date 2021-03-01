/**
 * Test 1 - OOP
 * @author Courtney Peacock
 * @date 17/02/2021
 * LibraryProgram main 
 */
public class LibraryProgram {

	public static void main(String[] args) {
		
		Library lib = new Library ();
		
		// set up library
		lib.addBook(new ReferenceBook ("Henry M. Walker", 
				"Problems for Computer Solution using BASIC",
				"0-87626-717-7", "QA76.73.B3W335", "Iowa Room"));
	lib.addBook(new ReferenceBook ("Samuel A. Rebelsky",
			"Experiments in Java", 
			"0201612674", "64.2 R25ex", "Iowa Room"));
	lib.addBook(new CirculatingBook ("John David Stone",
			"Algorithms for functional programming",
			"in process", "forthcoming"));
	lib.addBook(new CirculatingBook ("Henry M. Walker",
			"Computer Science 2:  Principles of Software Engineering, Data Types, and Algorithms",
			"0-673-39829-3", "QA76.758.W35"));

	lib.addBook(new CirculatingBook ("Henry M. Walker", 
			"Problems for Computer Solution using FORTRAN",
			"0-87626-654-5", "QA43.W34"));
	lib.addBook(new CirculatingBook ("Henry M. Walker",
			"Introduction to Computing and Computer Science with Pascal",
			"0-316-91841-5", "QA76.6.W3275"));
	lib.addBook(new CirculatingBook ("Samuel A. Rebelsky and Philip Barker", 
			"ED-MEDIA 2002 : World Conference on Educational Multimedia, Hypermedia & Telecommunications",
			"14. 1-880094-45-2", "64.2 25e"));
	lib.addBook(new CirculatingBook ("Henry M. Walker",
			"Pascal:  Problem Solving and Structured Program Design",
			"0-316-91848-2", "QA76.73.P2W35"));
	lib.addBook(new CirculatingBook ("Henry M. Walker",
		    "The Limits of Computing",
		    "0-7637-2552-8", "QA76.W185"));
	lib.addBook(new CirculatingBook ("Henry M. Walker",
		    "The Tao of Computing",
		    "0-86720-206-8", "QA76.W1855"));
	
	// Library list Beforemath 
	 lib.sortLibrary();
     lib.printLibrary();

     lib.checkout("Harry Potter", "07/02/2021", "QA43.W34");
     lib.checkout("Hermione", "17/01/2021", "QA76.6.W3275");
     lib.checkout("Luna Lovegood" , "17/02/2021", "64.2 R25ex");
     lib.checkout("Ron Weasley", "17/02/2021", "64.2 25e");
     lib.returned("QA76.6.W3275");
     lib.returned("QA76.73.P2W35");

     //Library Aftermath
     lib.printLibrary();
     
	}
	
}