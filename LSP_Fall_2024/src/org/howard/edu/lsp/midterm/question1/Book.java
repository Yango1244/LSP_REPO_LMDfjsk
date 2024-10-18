package org.howard.edu.lsp.midterm.question1;

public class Book {
	
	private String title;
	private String author;
	private String ISBN;
	private int yearPublished;
	
	public Book(String title, String author, String ISBN, int yearPublished) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.yearPublished = yearPublished;
	}
	
	 /**
     * Gets the book title
     *
     * @return the title of the book
     */
	public String getTitle() {
		return title;
	}
	
	 /**
     * Sets the book title.
     *
     * @param title, the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }
	
	/**
     * Gets the book author.
     *
     * @return book author
     */
	public String getAuthor() {
		return author;
	}
	
	/**
     * Sets the book author.
     *
     * @param author, the new author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
	
	 /**
     * Gets the book ISBN.
     *
     * @return book ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the book ISBN.
     *
     * @param ISBN, the new ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the publication year
     *
     * @return publication year
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the publication year
     *
     * @param yearPublished, the new publication year
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
    
    /**
     * Checks if book has same ISBN and author
     *
     * @param obj the object to compare with
     * @return true if ISBN and author are the same, false if they are not
     */
    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (ISBN.equals(book.ISBN) && author.equals(book.author)){
        	return true;
        }
        
        else {
        	return false;
        }
    }
    
    /**
     * Returns a string representation of the book in the format:
     *
     * @return book as a string
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
	
}
