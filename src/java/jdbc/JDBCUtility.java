/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.util.*;
import java.sql.*;

/**
 *
 * @author U
 */
public class JDBCUtility 
{
   Connection con;
   String driver;
   String url;
   String userName;
   String password;
   PreparedStatement psInsertBooking = null;
   PreparedStatement psSelectAllFromBooking = null;
   PreparedStatement psUpdateBookingViaIdApproved = null;
   PreparedStatement psDeleteBookingViaId = null;
   PreparedStatement psSelectAllFromDestination = null;
   PreparedStatement psUpdateDestinationImage = null;

   //use this constructor if using ConnectionPool
   public JDBCUtility()
   {
   }

   //use this constructor if not using ConnectionPool
   //ConnectionPool is used for multi user!
   public JDBCUtility(String driver,
                      String url,
                      String userName,
                      String password)
   {
      this.driver = driver;
      this.url = url;
      this.userName = userName;
      this.password = password;
   }

   public  void jdbcConnect()
   {
      try
	   {
         Class.forName (driver);
         con = DriverManager.getConnection(url, userName, password);
         DatabaseMetaData dma = con.getMetaData ();
         System.out.println("\nConnected to " + dma.getURL());
         System.out.println("Driver       " + dma.getDriverName());
         System.out.println("Version      " + dma.getDriverVersion());
         System.out.println("");
	   }
	   catch (SQLException ex)
	   {
         while (ex != null)
         {
		      System.out.println ("SQLState: " +
                                 ex.getSQLState ());
            System.out.println ("Message:  " +
                                 ex.getMessage ());
		      System.out.println ("Vendor:   " +
                                 ex.getErrorCode ());
            ex = ex.getNextException ();
		      System.out.println ("");
         }

         System.out.println("Connection to the database error");
	   }
	   catch (java.lang.Exception ex)
	   {
         ex.printStackTrace ();
	   }
   }

   public Connection jdbcGetConnection()
   {
   	return con;
   }

   public void jdbcConClose()
   {
   	try
   	{
         con.close();
   	}
   	catch (Exception ex)
	   {
	   }
   }

    public void prepareSQLStatement()
    {      
        try
        {
            //insert into booking
            String sqlInsertBooking = "INSERT INTO booking(login, traveldate, bookingdate, destination) " +
                                      "VALUES(?, ?, ?, ?)";
            
            psInsertBooking = con.prepareStatement(sqlInsertBooking);
            
            //select all from booking
            String sqlSelectAllFromBooking = "SELECT * FROM booking";
            psSelectAllFromBooking = con.prepareStatement(sqlSelectAllFromBooking);
            
            String sqlUpdateBookingViaIdApproved = "UPDATE booking SET status = 1 WHERE id = ?"; 
            psUpdateBookingViaIdApproved = con.prepareStatement(sqlUpdateBookingViaIdApproved); 
            
            //psDeleteBookingViaId
            String sqlDeleteBookingViaId = "DELETE booking WHERE id = ?"; 
            psDeleteBookingViaId = con.prepareStatement(sqlDeleteBookingViaId); 
            
            //select all from destination
            String sqlSelectAllFromDestination = "SELECT * FROM destinations";
            psSelectAllFromDestination = con.prepareStatement(sqlSelectAllFromDestination);
            
            //update destination image
            String sqlUpdateDestinationImage = "UPDATE destinations SET image = ? WHERE id = ?"; 
            psUpdateDestinationImage = con.prepareStatement(sqlUpdateDestinationImage); 
        }
	catch (SQLException ex)
	{
            while (ex != null)
            {
                System.out.println ("SQLState: " +
                                 ex.getSQLState ());
                System.out.println ("Message:  " +
                                 ex.getMessage ());
		System.out.println ("Vendor:   " +
                                 ex.getErrorCode ());
                ex = ex.getNextException ();
		      System.out.println ("");
            }
            
            System.out.println("Connection to the database error");
	}
	catch (java.lang.Exception ex)
	{
            ex.printStackTrace ();
	}
    }

    public PreparedStatement getPsInsertBooking()
    {
      return psInsertBooking;
    }
    
    public PreparedStatement getPsSelectAllFromBooking()
    {
      return psSelectAllFromBooking;
    }
    
    public PreparedStatement getPsUpdateBookingViaIdApproved()
    {
      return psUpdateBookingViaIdApproved;
    }
    
    public PreparedStatement getPsDeleteBookingViaId()
    {
      return psDeleteBookingViaId;
    }
    
    public PreparedStatement getPsSelectAllFromDestination()
    {
      return psSelectAllFromDestination;
    }  
    
    //psUpdateDestinationImage
    public PreparedStatement getPsUpdateDestinationImage()
    {
      return psUpdateDestinationImage;
    } 
}
