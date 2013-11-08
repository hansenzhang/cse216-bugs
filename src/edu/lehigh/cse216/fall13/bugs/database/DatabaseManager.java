/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.database;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author hansen
 */
public class DatabaseManager {
    private static SessionFactory factory; 
    
    public static DatabaseManager instance;
   
    /* Method to CREATE a bug in the database */
    public Integer addBug(Bug b) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;
        try {
            tx = session.beginTransaction();
            //Employee employee = new Employee(fname, lname, salary);
            //employeeID = (Integer) session.save(employee); 
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }
   /* Method to  READ all the employees */
   public ArrayList<Bug> listBugs(){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         //List employees = session.createQuery("FROM Employee").list(); 
         //for (Iterator iterator = 
         //                  employees.iterator(); iterator.hasNext();){
         //   Employee employee = (Employee) iterator.next(); 
         //   System.out.print("First Name: " + employee.getFirstName()); 
         //   System.out.print("  Last Name: " + employee.getLastName()); 
         //   System.out.println("  Salary: " + employee.getSalary()); 
         //}
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
      return null;
   }
   
   public Bug getBug (int bugId) {
       return null;
   }
   
   /* Method to UPDATE salary for an employee */
   public void editBug(Bug b){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         //Employee employee = 
         //           (Employee)session.get(Employee.class, EmployeeID); 
         //employee.setSalary( salary );
         //	 session.update(employee); 
         //tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
   /* Method to DELETE an employee from the records */
   public void deleteBug(Integer bugId){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
         tx = session.beginTransaction();
         //Employee employee = 
         //          (Employee)session.get(Employee.class, EmployeeID); 
         //session.delete(employee); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }finally {
         session.close(); 
      }
   }
}
