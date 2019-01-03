/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.io.Serializable;

/**
 *
 * @author U
 */
public class Booking implements Serializable {
    private int id;
    private String login;
    private String traveldate;
    private String bookingdate;
    private String destination;
    private int status;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the traveldate
     */
    public String getTraveldate() {
        return traveldate;
    }

    /**
     * @param traveldate the traveldate to set
     */
    public void setTraveldate(String traveldate) {
        this.traveldate = traveldate;
    }

    /**
     * @return the bookingdate
     */
    public String getBookingdate() {
        return bookingdate;
    }

    /**
     * @param bookingdate the bookingdate to set
     */
    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
}
