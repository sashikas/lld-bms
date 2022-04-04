package com.bookmyshow.core.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="auditoriums")
public class Auditorium extends Auditable {
    private String name;
    private boolean hasAirConditions;
    private boolean support3D;
    private int numberOfExits;
    private int numberOfEmergencyExits;

    @ManyToOne
    @Setter @Getter
    private Cinemas cinema;

    @OneToMany(mappedBy = "auditorium")
    @Getter @Setter
    private List<AudiSeat> seats =new ArrayList<>();

    @OneToMany(mappedBy = "auditorium")
    @Getter @Setter
    private List<MovieShow> shows=new ArrayList<>();

}
