package Assignments.SYSC2004A4;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * The test class SalesItemTest.
 *
 * @author  momin mushtaha
 * 101114546
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }
    
    /**
     * Test that 3 comments can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testThreeComments()
    {
        SalesItem salesIte2 = new SalesItem("momom", 24000);
        assertEquals(true, salesIte2.addComment("mostafa", "wow", 5));
        assertEquals(true, salesIte2.addComment("roy", "the console", 4));
         assertEquals(true, salesIte2.addComment("johnson", "amazing", 3));
        assertEquals(3, salesIte2.getNumberOfComments());
    }
    /**
     * Test that the same author can only postce once
     */
    @Test
    public void testExistingAuthor()
    {
        SalesItem salesIte1 = new SalesItem("iPhone X", 9000);
        assertEquals(true, salesIte1.addComment("Kareem", "whatever", 4));
        assertEquals(false, salesIte1.addComment("Kareem", "ya know", 3));
    }
    /**
     * Test that checks max and miniumum boundaries for ratings
     */
    @Test
    public void testCommentRatings()
    {
        SalesItem salesIte1 = new SalesItem("a7e", 900);
        assertEquals(false, salesIte1.addComment("memyselfandi", "coronavirus", 6));
        assertEquals(false, salesIte1.addComment("alaskabrain", "upup", 0));
    }
    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
       SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
       assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }
    

   /**
    * Test that a sales item is correctly initialised (name and price).
   */
   @Test
   public void testInit()
   {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
   }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }
    @Test
    public void findtheMostHelpfulComment() 
    {
        SalesItem salesIt1 = new SalesItem("kosomak", 5000);
        assertEquals(true, salesIt1.addComment("shaymaa", "albi we moftaho", 3));
        assertEquals(false, salesIt1.addComment("shaymaa", "dol been edeek", 1));
        assertEquals(false, salesIt1.addComment("shaymaa", "we masa2o we saba7o", 5));

        salesIt1.upvoteComment(0);
        salesIt1.upvoteComment(0);
        salesIt1.upvoteComment(2);
        salesIt1.upvoteComment(2);
        salesIt1.upvoteComment(2);

        salesIt1.showInfo();

        Comment newComment = salesIt1.findMostHelpfulComment();
        assertEquals("shaymaa", newComment.getAuthor());
        assertEquals(3, newComment.getVoteCount());

    }
    @Test
    public void testExistingAuthorComment() 
    {
        SalesItem salesIte1 = new SalesItem("name", 90090);
        assertEquals(true, salesIte1.addComment("martin", "hi, my name is", 4));
        assertEquals(true, salesIte1.addComment("martin", "slim shady", 3));

    }
    @Test
     public void testCommentRatingsBoundaries() 
     {
         SalesItem salesIte1 = new SalesItem("mwah", 90090000);
         assertEquals(false, salesIte1.addComment("martin", "hi, my name is", 6));
         assertEquals(false, salesIte1.addComment("martin", "slim shady", 0));

    }
    
}



