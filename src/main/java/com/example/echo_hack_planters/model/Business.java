package com.example.echo_hack_planters.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import  java.util.List ;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String NIPT ;

    private double unitCost;

    @OneToOne (optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="provider_id", nullable = false )
    private User provider ;

    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

//    @OneToMany(mappedBy = "business", cascade = CascadeType.ALL)
//    private  List<MealBusiness> meals =  new ArrayList<>() ;

}
