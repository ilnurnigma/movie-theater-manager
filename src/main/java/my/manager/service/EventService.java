package my.manager.service;

import my.manager.dao.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 7/1/2016.
 */
public class EventService {
    private static List<Event> events = new ArrayList<Event>();

    public void save(Event event) {
        events.add(event);
    }

    public void remove(Event event) {
        events.remove(event);
    }

    public Event getById(Long id) {
        if (id == null) {
            return null;
        }

        for (Event event : events) {
            if (id.equals(event.getId())) {
                return event;
            }
        }

        return null;
    }

    public Event getByName(String name) {
        if (name == null) {
            return null;
        }

        for (Event event : events) {
            if (name.equals(event.getName())) {
                return event;
            }
        }

        return null;
    }

    public List<Event> getAll() {
        return events;
    }
}
