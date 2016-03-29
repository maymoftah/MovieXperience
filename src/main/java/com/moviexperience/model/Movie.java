package com.moviexperience.model;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
/**Entity model class - contains all getters and setter**/

@Entity
@NamedQuery(name= "Movie.findByTitle", query = "SELECT m from Movie m where LOWER(m.title) like LOWER(:title)")
public class Movie {

    @Id
    @Column(name="id")
    private int ID;

    @Column(name = "title", nullable = false)
    private String title;


    private double length;

    private Long plot;

    private String rating;

    public int getID () {
        return ID;
    }

    public String getTitle () {
        return title;
    }

    public Long getPlot () {
        return plot;
    }

    public double getLength () {
        return length;
    }

    public String getRating () {
        return rating;
    }

    public void setID (int ID) {
        this.ID = ID;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public void setLength (double length) {
        this.length = length;
    }

    public void setPlot (Long plot) {
        this.plot = plot;
    }

    public void setRating (String rating) {
        this.rating = rating;
    }

}
