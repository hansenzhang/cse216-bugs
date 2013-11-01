//import the user class
import java.util.Date

public class Comment{

    private int bugID;
    private User user;
    private String msg;
    private Date date;
    
    public Comment(int bugID, User user, String msg){
	this.bugID = bugID;
	this.user = user;
	this.msg = msg;

	date = new Date();
	
    }

    public int getBugID(){
	return bugID;
    }
    
    public User getUser(){
	return user;
    }
 
    public String getMsg(){
	return msg;
    }

    public Date getDate(){
	return date;
    }

}
