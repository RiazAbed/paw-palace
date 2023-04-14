package com.booking.animal.pawpalace.entities;

import com.booking.animal.pawpalace.entities.objects.Diet;
import com.booking.animal.pawpalace.entities.objects.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_id_seq")
    @SequenceGenerator(name = "animal_id_seq", sequenceName = "animal_id_seq", allocationSize = 1)
    Long id;
    @Column
    String name;
    @Column
    Gender gender;
    @Column
    AnimalType AnimalType;
    @Column
    Owner owner;
    @Column
    Date dateOfBirth;
    @Column
    Diet diet;
    @Column
    Date checkIn;
    @Column
    Date checkOut;
    @Column
    String notes;
    @Column
    boolean isVaccinated;
    @Column
    boolean interactionApproved;
    @Column
    boolean neutered;

}
