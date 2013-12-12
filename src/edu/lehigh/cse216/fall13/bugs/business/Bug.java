package edu.lehigh.cse216.fall13.bugs.business;

import java.util.Date;
import java.util.UUID;


/**
 * 
 * @author hansen
 */
public class Bug implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    
    /**
     * Local fields
     */
    private String user;
    private UUID bugID;
    private Date date;
    private String version;
    private boolean fixed;
    private String description;
    private String summary;
    private String jdk;
    private String priority;
    private String product;
    
    private String os;
    private String severity;
    

    /**
     * Default constructor for testing
     */
    public Bug() {
    }
    
    /**
     * Additional constructor for testing.
     * @param id 
     */
    public Bug (UUID id) {
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
    public Bug(String version, String description){
	//Generate id (We may want to handle this in the controller instead
	date = new Date();
	//dunno if we have to do more for the date
	fixed = false;
	this.version = version;
	this.description = description;
    }
    
    public Bug(boolean fixed, String description, 
            String jdk, String os, String priority, String product,
            String summary, String severity, String user, String version
    ) {
        this.date = new Date();
        this.bugID = UUID.randomUUID();       
        this.fixed = fixed;
        this.description = description;
        this.jdk = jdk;
        this.os = os;
        this.priority = priority;
        this.product = product;       
        this.summary = summary;
        this.severity = severity;
        this.user = user;
        this.version = version;                       
    }

    /**
     * Used to update the version of the class
     */
    public void updateVersion(){
	// not sure how we're doing this
    }

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
    public UUID getID(){
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

    public UUID getBugID() {
        return bugID;
    }

    public String getSummary() {
        return summary;
    }

    public String getJdk() {
        return jdk;
    }

    public String getProduct() {
        return product;
    }

    public String getOs() {
        return os;
    }

    public String getSeverity() {
        return severity;
    }
    
    public String getPriority() {
        return priority;
    }
    
    public String getUser() {
        return user;
    }
    
    @Override
    public String toString() {
        //This will need to be fixed to look nice in the Jlist
        return "Test Bug " + bugID;
    }
}
