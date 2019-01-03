/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booking;

import bean.Booking;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import jdbc.JDBCUtility;

/**
 *
 * @author U
 */
@WebServlet(name = "ViewBookingServlet", urlPatterns = {"/ViewBookingServlet"})
public class ViewBookingServlet extends HttpServlet {
    private JDBCUtility jdbcUtility;
    private Connection con;
    
    public void init() throws ServletException
    {
        String driver = "com.mysql.jdbc.Driver";

        String dbName = "scj2303";
        String url = "jdbc:mysql://localhost/" + dbName + "?";
        String userName = "root";
        String password = "";

        jdbcUtility = new JDBCUtility(driver,
                                      url,
                                      userName,
                                      password);

        jdbcUtility.jdbcConnect();
        con = jdbcUtility.jdbcGetConnection();
        jdbcUtility.prepareSQLStatement();
    }            
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession(true);
        ArrayList bookings = new ArrayList();
        Booking booking = null;
        
        try {                    
            ResultSet rs = jdbcUtility.getPsSelectAllFromBooking().executeQuery();
            
            while (rs.next()) {                
                booking = new Booking();
                booking.setId(rs.getInt("id"));
                booking.setLogin(rs.getString("login"));
                
                //yyyy-MM-dd
                String traveldate = rs.getString("traveldate");
                
                //convert traveldate string to date (still mysql date)
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                try {
                   date = formatter.parse(traveldate);
                } catch (Exception ex) {}
                
                //convert mysql date to MY date
                formatter = new SimpleDateFormat("dd-MM-yyyy");
                traveldate = formatter.format(date); 
                booking.setTraveldate(traveldate);
                
                //yyyy-MM-dd HH:mm:ss
                //parse the date from string for date conversion
                String bookingdate = rs.getString("bookingdate");
                formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                date = new Date();
                try {
                   date = formatter.parse(bookingdate);
                } catch (Exception ex) {}
                
                //convert to MY format dd-MM-yyyy
                //formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a");
                //formatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss a");
                formatter = new SimpleDateFormat("dd MMMM, yyyy HH:mm:ss a");
                bookingdate = formatter.format(date);
                booking.setBookingdate(bookingdate);
                
                booking.setDestination(rs.getString("destination")); 
                
                booking.setStatus(rs.getInt("status"));
                    
                bookings.add(booking);
            }
        }
        catch (SQLException ex) 
        {            
        }
        
        session.setAttribute("bookings", bookings);
        sendPage(request, response, "/viewbookings.jsp");
    }
    
    void sendPage(HttpServletRequest req, HttpServletResponse res, String fileName) throws ServletException, IOException
    {
        // Get the dispatcher; it gets the main page to the user
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(fileName);

	if (dispatcher == null)
	{
            System.out.println("There was no dispatcher");
	    // No dispatcher means the html file could not be found.
	    res.sendError(res.SC_NO_CONTENT);
	}
	else
	    dispatcher.forward(req, res);
    }    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
