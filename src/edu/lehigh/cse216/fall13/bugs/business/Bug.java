package edu.lehigh.cse216.fall13.bugs.business;

import java.util.Date;
import java.util.UUID;


/**
 * 
 * @author Group A
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
     * Instantiates the global variables version, description, and category.
     * 
     * @param	version		String that stores the current version of the bug
     * @param	description	String that stores the description of the bug
     * @param	category	String that stores the category of Bug
     */
    public Bug(String version, String description){
	//Generate id (We may want to handle this in the controller instead
	date = new Date();
	//dunno if we have to do more for the date
	this.version = version;
	this.description = description;
    }
    
    /**
     * 
     * @param description
     * @param jdk
     * @param os
     * @param priority
     * @param product
     * @param summary
     * @param severity
     * @param user
     * @param version 
     */
    public Bug(String description, 
            String jdk, String os, String priority, String product,
            String severity, String summary, String user, String version
    ) {
        this.date = new Date();
        this.bugID = UUID.randomUUID();       
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


    //Getters and setters
    public UUID getBugID() {
        return bugID;
    }
    
    public Date getDate(){
	return date;
    }

    public String getVersion(){
	return version;
    }

    public String getDescription(){
	return description;
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
        return "Test Bug " + bugID;
    }

    public void setBugId(UUID bugID) {
        this.bugID = bugID;
    }
}
