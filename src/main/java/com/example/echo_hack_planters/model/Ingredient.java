package com.example.echo_hack_planters.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private double amount;

    private String unit;

    private  double CO2Coefficient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id")
    @JsonIgnore
    private Meal meal;


}
