package Assignments.SYSC2004A3; /**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Club
{
    
    private ArrayList<Membership> myMembershipList;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        myMembershipList = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        myMembershipList.add(member);
    }
    
    /**
     * Determine the number of members who joined in the given month
     * @param month The month we are interested in
     * @return The number of members joining in month
     */
    public int joinedInMonth(int month)
   {
       int memberships = 0;
       if((month) >12 || (month <1))
       {
           System.out.println("Invalid month");
           
        }
        else
        {
            for(Membership myMembership : myMembershipList)
            {
                if(myMembership.getMonth()==month)
                memberships++;
            }
        }
       return memberships;
    }
    /**
     * Remove from the club's collection all members who joined in the given month
     * and return them stored in separate collection object.
     * @param month The month of the Membership
     * @param year The year of the Membership
     * @return The members who joined in the given month and year
     */
    public ArrayList<Membership> purge(int month, int year)
    {
        ArrayList<Membership> myMemberships = new ArrayList <Membership>();
        if((month) >12 || (month <1))
       {
           System.out.println("Invalid month");
           
        }
        else
        {
            Iterator<Membership> myItem = myMembershipList.iterator();
            while(myItem.hasNext())
            {
                Membership mb = myItem.next();
                if((mb.getMonth()==month)&&(mb.getYear()==year))
                {
                    myMemberships.add(mb);
                    myItem.remove();
                }
            }
        }
        return myMemberships;
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return myMembershipList.size();
    }
}