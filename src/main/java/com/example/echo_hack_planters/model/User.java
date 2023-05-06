package com.example.echo_hack_planters.model;

import com.example.echo_hack_planters.Enum.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User", indexes = {
        @Index(name = "idx_user_email", columnList = "email")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;


    private String surname;

    @NotBlank
    @NotNull
    @Column(nullable = false)
    @Email
    private String email;


    @NotBlank(message = "Password can't be null")
    private String password;

    private Role role;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;


    @OneToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Business business;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private  List<Order> orders = new ArrayList<>();

//
//
//    @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
//    @JoinTable(name = "user_restaurant",
//            joinColumns =
//                    {@JoinColumn(name = "restaurant_id")},
//            inverseJoinColumns =
//                    {@JoinColumn(name = "user_id")})
//    @JsonIgnore
//    private Restaurant restaurant;
//
//    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Order> orders = new ArrayList<>();
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", email='" + email + '\'' +
//                ", phone=" + phone +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", role=" + role +
//                ", restaurant=" + restaurant +
//                ", orders=" + orders +
//                '}';
//    }


}
