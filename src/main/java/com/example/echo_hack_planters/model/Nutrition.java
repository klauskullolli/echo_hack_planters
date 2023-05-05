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
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name ;

    private  boolean CO2Coefficient;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "nutrition_ingredients",

            joinColumns =
                    {@JoinColumn(name = "nutrition_id")},
            inverseJoinColumns =
                    {@JoinColumn(name = "ingredient_id")})
    @JsonIgnore
    private  List<Ingredient> ingredients = new ArrayList<>();
}
