package com.project.fruits_legumes.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "legumes")
@Getter
@Setter
@NoArgsConstructor
public class Legume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", length = 50)
    private String name;

    @Column(name = "origine", length = 150)
    private String origin;

    @ElementCollection(fetch = FetchType.EAGER)
    @Column(name = "saison")
    private List<String> season;

    @Column(name = "price_per_kg")
    private BigDecimal pricePerKg;

    @Column(name = "quantite", length = 150)
    private String quantity;

    public Legume(String name, String origin, List<String> season, BigDecimal pricePerKg, String quantity) {
        this.name = name;
        this.origin = origin;
        this.season = season;
        this.pricePerKg = pricePerKg;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Legume{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", season=" + season +
                ", pricePerKg=" + pricePerKg +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
