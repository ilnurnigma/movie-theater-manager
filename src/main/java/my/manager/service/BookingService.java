package my.manager.service;

import my.manager.dao.Event;
import my.manager.dao.Ticket;
import my.manager.dao.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created on 7/6/2016.
 */
public class BookingService {
    public Double getTicketsPrice(Event event, Date dateTime, User user, List<Integer> seats) {
        return 1.2;
    }

    public void bookTicket() {

    }

    public List<Ticket> getPurchasedTicketsForEvent(Event event, Date dateTime) {
        return new ArrayList<>();
    }
}
