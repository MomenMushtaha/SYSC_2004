package Labs.SYSC2004L8;

/**

 * @author Momin Mushtaha

 * @version 101114546

 */
public class EventPost extends Post
{ //eventType field
    private String eventType;
    public EventPost(String author, String eventType) 
    {
        super(author);
        this.eventType = eventType;
    }
    //the mutator asked for (setEventType)
    public void setEventType(String eventType)
    {

        this.eventType = eventType;

    }
    public String toString(Post post)
    {
        return post.toString();
    }
    //the accessor asked for(getEventType)
    public String getEventType() 
    {
        return eventType;
    }
    
}