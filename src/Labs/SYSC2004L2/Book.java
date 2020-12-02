package Labs.SYSC2004L2;

/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (momen.)
 * @version (Insert today's date here.)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    public String getAuthor()
    {
        return author;
    }
    public String gettitle()
    {
        return title;
    }
     public void printAuthor()
    {
        
        System.out.println(author);
    }
     public void printTitle()
    {
        
        System.out.println(title);
    }
}

