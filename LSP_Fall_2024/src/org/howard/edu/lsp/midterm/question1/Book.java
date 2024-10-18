package org.howard.edu.lsp.midterm.question1;
/**
 * Class represents a book in library.
 * Contains attributes related to a book, including its title, author, ISBN, and publication year.
 */
public class Book {
	// Book attributes
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Create a new Book instance with the specified title, author, ISBN, and year published.
     * 
     * @param title, The title of the book.
     * @param author, The author of the book.
     * @param ISBN, The ISBN number of the book.
     * @param yearPublished, The year the book was published.
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets book title.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets book author.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Gets book ISBN number.
     *
     * @return The ISBN number of the book.
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Gets the year the book was published.
     *
     * @return The year published.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets book title.
     *
     * @param title, The title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets book author.
     *
     * @param author, The author to set.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Sets book ISBN number.
     *
     * @param ISBN, The ISBN to set.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished, The year to set.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Checks if two Book objects are equal based on their ISBN and author.
     *
     * @param obj, The object to compare to.
     * @return true, if the books have the same ISBN and author; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return author.equals(book.author) && ISBN.equals(book.ISBN);
    }

    /**
     * Returns string representation of the Book object.
     *
     * @return A string that represents the book.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}
