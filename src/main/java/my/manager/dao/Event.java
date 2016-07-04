package my.manager.dao;

import my.manager.enums.Rating;

/**
 * Created on 7/1/2016.
 */
public class Event {
    private String name;
    private Double basePrice;
    private Rating rating;
    private Long id;

    public Event(String name, Double basePrice, Rating rating) {
        this.name = name;
        this.basePrice = basePrice;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (name != null ? !name.equals(event.name) : event.name != null) return false;
        if (basePrice != null ? !basePrice.equals(event.basePrice) : event.basePrice != null) return false;
        return rating == event.rating;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (basePrice != null ? basePrice.hashCode() : 0);
        result = 31 * result + (rating != null ? rating.hashCode() : 0);
        return result;
    }
}
