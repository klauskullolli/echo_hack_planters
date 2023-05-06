package com.example.echo_hack_planters.model;

import com.example.echo_hack_planters.Enum.Category;
import com.example.echo_hack_planters.Enum.Cuisine;
import com.example.echo_hack_planters.Enum.HealthGoal;
import com.example.echo_hack_planters.Enum.Preferences;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import  java.util.List ;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private Category category ;

    private  String  imgSrc;

    private double price;

    private double calories;

    private String description;

    @Enumerated(value = EnumType.STRING)
    private Cuisine cuisine ;

    @Enumerated(value = EnumType.STRING)
    private Preferences preference ;


    private HealthGoal healthGoal ;

    private  double CO2Coefficient;


    @OneToMany(mappedBy = "meal", fetch = FetchType.LAZY)
    private List<Ingredient> ingredients =  new ArrayList<>();


    @OneToMany(mappedBy = "meal", fetch = FetchType.EAGER)
    private  List<Nutrition> nutritions = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "business_id")
    @JsonIgnore
    private Business business;


}
