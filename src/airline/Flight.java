/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author tushaar
 */
@Entity
@Table(name = "Flight", catalog = "airline", schema = "")
@NamedQueries({
    @NamedQuery(name = "Flight.findAll", query = "SELECT f FROM Flight f")
    , @NamedQuery(name = "Flight.findByFlightID", query = "SELECT f FROM Flight f WHERE f.flightID = :flightID")
    , @NamedQuery(name = "Flight.findByArrivalTime", query = "SELECT f FROM Flight f WHERE f.arrivalTime = :arrivalTime")
    , @NamedQuery(name = "Flight.findByDepartureTime", query = "SELECT f FROM Flight f WHERE f.departureTime = :departureTime")
    , @NamedQuery(name = "Flight.findByFare", query = "SELECT f FROM Flight f WHERE f.fare = :fare")
    , @NamedQuery(name = "Flight.findByOriginAirport", query = "SELECT f FROM Flight f WHERE f.originAirport = :originAirport")
    , @NamedQuery(name = "Flight.findByDestinationAirport", query = "SELECT f FROM Flight f WHERE f.destinationAirport = :destinationAirport")})
public class Flight implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "flightID")
    private Integer flightID;
    @Basic(optional = false)
    @Column(name = "arrivalTime")
    private String arrivalTime;
    @Basic(optional = false)
    @Column(name = "departureTime")
    private String departureTime;
    @Basic(optional = false)
    @Column(name = "fare")
    private int fare;
    @Basic(optional = false)
    @Column(name = "originAirport")
    private String originAirport;
    @Basic(optional = false)
    @Column(name = "destinationAirport")
    private String destinationAirport;

    public Flight() {
    }

    public Flight(Integer flightID) {
        this.flightID = flightID;
    }

    public Flight(Integer flightID, String arrivalTime, String departureTime, int fare, String originAirport, String destinationAirport) {
        this.flightID = flightID;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.fare = fare;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
    }

    public Integer getFlightID() {
        return flightID;
    }

    public void setFlightID(Integer flightID) {
        Integer oldFlightID = this.flightID;
        this.flightID = flightID;
        changeSupport.firePropertyChange("flightID", oldFlightID, flightID);
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        String oldArrivalTime = this.arrivalTime;
        this.arrivalTime = arrivalTime;
        changeSupport.firePropertyChange("arrivalTime", oldArrivalTime, arrivalTime);
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        String oldDepartureTime = this.departureTime;
        this.departureTime = departureTime;
        changeSupport.firePropertyChange("departureTime", oldDepartureTime, departureTime);
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        int oldFare = this.fare;
        this.fare = fare;
        changeSupport.firePropertyChange("fare", oldFare, fare);
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        String oldOriginAirport = this.originAirport;
        this.originAirport = originAirport;
        changeSupport.firePropertyChange("originAirport", oldOriginAirport, originAirport);
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        String oldDestinationAirport = this.destinationAirport;
        this.destinationAirport = destinationAirport;
        changeSupport.firePropertyChange("destinationAirport", oldDestinationAirport, destinationAirport);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flightID != null ? flightID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Flight)) {
            return false;
        }
        Flight other = (Flight) object;
        if ((this.flightID == null && other.flightID != null) || (this.flightID != null && !this.flightID.equals(other.flightID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airline.Flight[ flightID=" + flightID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
