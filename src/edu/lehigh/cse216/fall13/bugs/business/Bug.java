package edu.lehigh.cse216.fall13.bugs.business;

import java.util.Date;


/**
 * 
 * @author hansen
 */
public class Bug{
    /**
     * Local fields
     */
    private int bugID;
    private Date date;
    private String version;
    private boolean fixed;
    private String description;
    private String category;

    /**
     * Default constructor for testing
     */
    public Bug() {
    }
    
    /**
     * Additional constructor for testing.
     * @param id 
     */
    public Bug (int id) {
        this.bugID = id;
    }
    
    /**
     * Constructor for the Bug object.
     * Creates a date object to store when it was created.
     * Instantiates the global variables fixed, version, description, and category.
     * 
     * @param	version		String that stores the current version of the bug
     * @param	description	String that stores the description of the bug
     * @param	category	String that stores the category of Bug
     */
    public Bug(String version, String description, String category){
	//Generate id (We may want to handle this in the controller instead
	date = new Date();
	//dunno if we have to do more for the date
	fixed = false;
	this.version = version;
	this.description = description;
	this.category = category;
    }

    /**
     * Used to update the version of the class
     */
    public void updateVersion(){
	// not sure how we're doing this
    }

    /**
     * Used to add a comment to the class
     * @param user
     * @param msg
     */
    public void addComment(User user, String msg){
	Comment c = new Comment(bugID, user, msg);
	//add c to database, which may mean passing db manager as param
    }

    //Setters
    /**
     * Used to edit the description of the Bug
     * @param newDescription
     */
    public void editDescription(String newDescription){
	description = newDescription;
    }


    /**
     * Used to show the bug has been fixed
     */
    public void fixed(){
	fixed = true;
    }

    //Getters
    public int getID(){
	return bugID;
    }

    public Date getDate(){
	return date;
    }

    public String getVersion(){
	return version;
    }

    public boolean isFixed(){
	return fixed;
    }

    public String getDescription(){
	return description;
    }

    public String getCategory(){
	return category;
    }
    
    @Override
    public String toString() {
        //This will need to be fixed to look nice in the Jlist
        return "Test Bug " + bugID;
    }
}
