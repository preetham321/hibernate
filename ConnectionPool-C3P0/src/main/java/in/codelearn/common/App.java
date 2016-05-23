package in.codelearn.common;

import in.codelearn.model.Employee;
import in.codelearn.persistence.HibernateUtil;

import java.sql.Date;

import org.hibernate.Session;
Preetham


public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Hibernate Example Annotations");
         Session session = HibernateUtil.getSessionFactory().openSession();
         
         session.beginTransaction();
         Employee emp = new Employee("James", "Bond", new Date(System.currentTimeMillis()), "007");
         
         session.save(emp);
         session.getTransaction().commit();
         session.close();
		
	}    
}
