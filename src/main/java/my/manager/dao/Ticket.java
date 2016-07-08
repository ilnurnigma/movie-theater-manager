package my.manager.dao;

import java.util.Date;

/**
 * Created on 7/6/2016.
 */
public class Ticket {
    private Event event;
    private Date dateTime;
    private Integer seat;
    private User user;

    public Ticket(Event event, Date dateTime, Integer seat, User user) {
        this.event = event;
        this.dateTime = dateTime;
        this.seat = seat;
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
