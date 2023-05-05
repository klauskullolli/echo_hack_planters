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

    private  boolean CO2Coefficient;

    @ManyToMany(mappedBy = "ingredients", fetch = FetchType.EAGER)
    private  List<Nutrition> nutritions = new ArrayList<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "meal_ingredients",

            joinColumns =
                    {@JoinColumn(name = "ingredient_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "meal_id")})
    @JsonIgnore
    private  List<Meal> meals = new ArrayList<>() ;


}
