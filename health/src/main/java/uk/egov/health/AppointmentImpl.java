package uk.egov.health;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 02/01/2015
 * Time: 16:01
 */


@XmlRootElement()
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "record", propOrder = {"ref", "date", "doctor", "summary", "notes" })
@WebService()
public class AppointmentImpl implements Appointment {

    private static String ref;
    private static Date date;
    private static String doctor;
    private static String summary;
    private static String notes;

    public String getRef() {
        return this.ref;
    }
    
    public void setRef(String ref) {
        this.ref = ref;
    }
    
    public String getDate() {
        return this.date.toString();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDoctor() {
        return this.doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public AppointmentImpl getRecord(String ref) {
        this.setRef("12345");
        this.setDate(new Date());
        this.setDoctor("Dr Hands");
        this.setSummary("Regular patient checkup");
        this.setNotes("Patient has recently changed address, will schedule a flu shot for the coming winter");
        
        return this;
    }
}
