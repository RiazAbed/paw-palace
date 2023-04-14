package com.booking.animal.pawpalace.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class AnimalType {
    @Id
    Long id;
    @Column
    String species;
    @Column
    String breed;
    @Column
    String coat;
    @Column
    String extraIdentifiers;
}
