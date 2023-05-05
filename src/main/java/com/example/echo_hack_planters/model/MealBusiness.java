package com.example.echo_hack_planters.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "meal_business")
public class MealBusiness {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private boolean price ;

    @ManyToOne(optional = false, fetch =  FetchType.LAZY)
    @JoinColumn(name = "meal_id" , nullable = false)
    private Meal meal ;


    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "business_id" , nullable = false)
//    @JoinColumn
    private Business business ;


}
