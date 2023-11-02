package ua.edu.ucu.apps.lab7flower.flowers.flower;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
@Entity
@NoArgsConstructor
public class Flower {
    @Id
    private int id;
    private double price;
    private double sepalLength;
    private FlowerColor color;

    public String getColor() {
        return color.toString();
    }

    public double getPrice() {
        return price;
    }
}
