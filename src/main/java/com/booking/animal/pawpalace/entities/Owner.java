package com.booking.animal.pawpalace.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_id_seq")
    @SequenceGenerator(name = "animal_id_seq", sequenceName = "animal_id_seq", allocationSize = 1)
    Long id;
}
