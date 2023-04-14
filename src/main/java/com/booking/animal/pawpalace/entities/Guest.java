package com.booking.animal.pawpalace.entities;

import com.booking.animal.pawpalace.entities.objects.Diet;
import com.booking.animal.pawpalace.entities.objects.Gender;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Table
@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animal_id_seq")
    @SequenceGenerator(name = "animal_id_seq", sequenceName = "animal_id_seq", allocationSize = 1)
    Long id;
    @Column
    String name;
    @Enumerated(EnumType.STRING)
    @Column
    Gender gender;
    @OneToOne
    @PrimaryKeyJoinColumn
    AnimalType animalType;
    @OneToOne
    @PrimaryKeyJoinColumn
    Owner owner;
    @Column(name = "dateofbirth")
    Date dateOfBirth;
    @Enumerated(EnumType.STRING)
    @Column
    Diet diet;
    @Column(name = "checkin")
    Date checkIn;
    @Column(name = "checkout")
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
