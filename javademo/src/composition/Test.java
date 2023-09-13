package composition;


	import java.io.*;
	import java.util.*;
	 
	// Class 1
	// Helper class
	// Book class
	class Book {
	 
	    // Member variables of this class
	    public String title;
	    public String author;
	 
	    // Constructor of this class
	    Book(String title, String author)
	    {
	 
	        // This keyword refers top current instance
	        this.title = title;
	        this.author = author;
	    }
	}
	 
	// Class 2
	// Helper class
	// Library class contains list of books.
	class Library {
	 
	    // Reference to refer to list of books.
	    private final List<Book> books;
	 
	    // Constructor of this class
	    Library(List<Book> books)
	    {
	 
	        // This keyword refers to current instance itself
	        this.books = books;
	    }
	 
	    // Method of this class
	    // Getting the list of books
	    public List<Book> getListOfBooksInLibrary()
	    {
	        return books;
	    }
	}



