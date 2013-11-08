package edu.lehigh.cse216.fall13.bugs.business;

//import the user class
import java.util.Date;

/**
 * This object is used to store the comments that users make on each bug object
 * 
 */

public class Comment{

    private int bugID;
    private User user;
    private String msg;
    private Date date;
    
    
    /**
     * Constructor for the comment object
     * Instantiates the bug ID, the user who created it, and the body of the comment
     * 
     * @param	bugID	int that stores the ID of the bug the comment is for
     * @param	user	User object that is the user that submitted the comment
     * @param	msg	String that is the body of the comment
     */
    public Comment(int bugID, User user, String msg){
	this.bugID = bugID;
	this.user = user;
	this.msg = msg;

	date = new Date();
	
    }

    /**
     * Returns an int that is the bugID 
     */
    public int getBugID(){
	return bugID;
    }
    
    /**
     * Returns the User object of the user that submitted the comment
     */
    public User getUser(){
	return user;
    }
 
    /**
     * Returns the body of the Comment
     */
    public String getMsg(){
	return msg;
    }

    /**
     * Returns the Date object, giving the date the comment was created.
     */
    public Date getDate(){
	return date;
    }

}
