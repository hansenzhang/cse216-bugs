package edu.lehigh.cse216.fall13.bugs.business;

import java.util.Date;
//import user, comment

public class Bug{
    
    private int bugID;
    private Date date;
    private String version;
    private boolean fixed;
    private String description;
    private String category;

    public Bug(String version, String description, String category){
	//Generate id (We may want to handle this in the controller instead
	date = new Date();
	//dunno if we have to do more for the date
	fixed = false;
	this.version = version;
	this.description = description;
	this.category = category;
    } 

    public void updateVersion(){
	// not sure how we're doing this
    }

    public void addComment(User user, String msg){
	Comment c = new Comment(bugID, user, msg);
	//add c to database, which may mean passing db manager as param
    }

    //Setters
    public void editDescription(String newDescription){
	description = newDescription;
    }

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
	return false; //TODO: need to really not have this.
    }

    public String getDescription(){
	return description;
    }

    public String getCategory(){
	return category;
    }
}
