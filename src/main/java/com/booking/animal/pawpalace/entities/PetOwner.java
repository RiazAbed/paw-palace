package com.booking.animal.pawpalace.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class PetOwner {
    @Id
    Long id;
    @Column
    String name;
    @Column
    String address;
    @Column(name = "phone_number")
    Long phoneNumber;
    @Column(name = "email_address")
    String emailAddress;

}
