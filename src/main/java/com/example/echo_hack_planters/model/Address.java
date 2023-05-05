package com.example.echo_hack_planters.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private double longitude;

    @NotNull
    private double latitude;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;


    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Business business;
}
