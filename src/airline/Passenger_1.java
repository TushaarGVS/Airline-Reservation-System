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
@Table(name = "Passenger", catalog = "airline", schema = "")
@NamedQueries({
    @NamedQuery(name = "Passenger_1.findAll", query = "SELECT p FROM Passenger_1 p")
    , @NamedQuery(name = "Passenger_1.findByPassengerName", query = "SELECT p FROM Passenger_1 p WHERE p.passengerName = :passengerName")
    , @NamedQuery(name = "Passenger_1.findByPassengerID", query = "SELECT p FROM Passenger_1 p WHERE p.passengerID = :passengerID")
    , @NamedQuery(name = "Passenger_1.findByAddress", query = "SELECT p FROM Passenger_1 p WHERE p.address = :address")
    , @NamedQuery(name = "Passenger_1.findByMobileNumber", query = "SELECT p FROM Passenger_1 p WHERE p.mobileNumber = :mobileNumber")
    , @NamedQuery(name = "Passenger_1.findByEmail", query = "SELECT p FROM Passenger_1 p WHERE p.email = :email")
    , @NamedQuery(name = "Passenger_1.findByAge", query = "SELECT p FROM Passenger_1 p WHERE p.age = :age")
    , @NamedQuery(name = "Passenger_1.findByGender", query = "SELECT p FROM Passenger_1 p WHERE p.gender = :gender")})
public class Passenger_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "passengerName")
    private String passengerName;
    @Id
    @Basic(optional = false)
    @Column(name = "passengerID")
    private Integer passengerID;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "mobileNumber")
    private String mobileNumber;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "age")
    private int age;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;

    public Passenger_1() {
    }

    public Passenger_1(Integer passengerID) {
        this.passengerID = passengerID;
    }

    public Passenger_1(Integer passengerID, String passengerName, String address, String mobileNumber, String email, int age, String gender) {
        this.passengerID = passengerID;
        this.passengerName = passengerName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        String oldPassengerName = this.passengerName;
        this.passengerName = passengerName;
        changeSupport.firePropertyChange("passengerName", oldPassengerName, passengerName);
    }

    public Integer getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(Integer passengerID) {
        Integer oldPassengerID = this.passengerID;
        this.passengerID = passengerID;
        changeSupport.firePropertyChange("passengerID", oldPassengerID, passengerID);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        String oldMobileNumber = this.mobileNumber;
        this.mobileNumber = mobileNumber;
        changeSupport.firePropertyChange("mobileNumber", oldMobileNumber, mobileNumber);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (passengerID != null ? passengerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passenger_1)) {
            return false;
        }
        Passenger_1 other = (Passenger_1) object;
        if ((this.passengerID == null && other.passengerID != null) || (this.passengerID != null && !this.passengerID.equals(other.passengerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "airline.Passenger_1[ passengerID=" + passengerID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
