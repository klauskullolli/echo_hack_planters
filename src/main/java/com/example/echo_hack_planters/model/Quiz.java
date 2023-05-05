package com.example.echo_hack_planters.model;

import com.example.echo_hack_planters.Enum.Cuisine;
import com.example.echo_hack_planters.Enum.HealthGoal;
import com.example.echo_hack_planters.Enum.Preferences;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @ElementCollection(fetch = FetchType.LAZY)
//    @Enumerated(EnumType.STRING)
    private List<Preferences> preferences  =  new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    private  List<String> alergies =  new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    private  List<String> intoleranca =  new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    private List<Cuisine> cuisines = new ArrayList<>();

    @ElementCollection(fetch = FetchType.LAZY)
    private List<HealthGoal> healthGoals = new ArrayList<>();

    @Column( name= "good_impact")
    private boolean goodImpact ;


    @OneToOne
    @JsonIgnore
    private User user;




}
