package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="movieshows")
public class MovieShow extends Auditable{
    //attribs
    @Getter @Setter
    private Date timingFrom;
    @Getter @Setter
    private Date timingTo;

    //relationships
    @OneToMany(mappedBy="show")
    private List<booking> bookings=new ArrayList<>();

    @ManyToOne
    @Getter @Setter
    private Auditorium auditorium;
    @ManyToOne
    @Getter @Setter
    private Movie movie;

}
//Entity
//Booking,MovieShow
//each entity gets its own table
//attributes of the entity become column in the table
    //relationship
    //one-to-one is just a column in the table
    //one to many relationship => the table which has * will get a columns
    //many to many gets a separate table
        //Movie,genre
        //movie_genres => movie_id, genre_id
