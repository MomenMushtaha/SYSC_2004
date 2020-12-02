------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:club
VERSION or DATE: Feb 28, 2020
AUTHORS: Mo'men Mushtaha
PURPOSE OF PROJECT:
The main objective of this programming assignment No 3 is to learn how to use effectively the
ArrayList collection in designing and defining classes, and to learn and experiment with control
flow structures such as a for-each loop, or a while loop, or an iterator. To this end we will be
reusing the club project that has three classes: ClubDemo, Club and Membership from Chapter
4.
Q1: Use the club project to complete this and the following questions. Your task is to complete
the Club class, an outline of which has been provided in the project. The Club class is intended to
store Membership objects in a collection.
Within Club, define a field for an ArrayList. Use an appropriate import statement for this field,
and think carefully about the element type of the list. In the constructor, create the collection
object and assign it to the field. Make sure that all the files in the project compile before moving
on to the next questions.
Q2: Complete the numberOfMembers method to return the current size of the collection. Until
you have a method to add objects to the collection, this will always return zero, of course, but it
will be ready for further testing later
Q3: Membership of a club is represented by an instance of the Membership class. A complete
version of Membership is already provided for you in the club project, and it should not need any
modification. An instance contains details of a person’s name and the month and year in which
they joined the club. All membership details are filled out when an instance is created. A new
Membership object is added to a Club object’s collection via the Club object’s join method,
which has the following description:
/** * Add a new member to the club’s collection of members.
 * @param member the member object to be added.
*/
public void join (Membership member)
Complete the join method.
When you wish to add a new Membership object to the Club object from the object bench, there
are two ways you can do this. Either create a new Membership object on the object bench, call
the join method on the Club object, and click on the Membership object to supply the parameter
or call the join method on the Club object and type into the method’s parameter dialog box:
 new Membership ("member name ...", month, year)
Each time you add one, use the numberOfMembers method to check both that the join method is
adding to the collection and that the numberOfMembers method is giving the correct result. 
