package my.manager.service;

import my.manager.dao.Auditorium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created on 7/1/2016.
 */
public class AuditoriumService {
    private List<Auditorium> auditoriums = new ArrayList<>();

    public AuditoriumService(List<String> a, List<Integer> b, List<String> c) {
        if (a.size() != b.size()) {
            throw new IllegalArgumentException();
        }

        if (a.size() != c.size()) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < a.size(); i++) {
            List<String> vipSeatsString = Arrays.asList(c.get(i).split(","));
            List<Integer> vipSeats = new ArrayList<>();
            vipSeats.addAll(vipSeatsString.stream().map(Integer::valueOf).collect(Collectors.toList()));

            auditoriums.add(new Auditorium(a.get(i), b.get(i), vipSeats));
        }

        System.out.println(auditoriums);
    }

    public List<Auditorium> getAll() {
        return auditoriums;
    }

    public Auditorium getByName(String name) {
        for (Auditorium auditorium : auditoriums) {
            if (name.equals(auditorium.getName())) {
                return auditorium;
            }
        }

        return null;
    }
}
