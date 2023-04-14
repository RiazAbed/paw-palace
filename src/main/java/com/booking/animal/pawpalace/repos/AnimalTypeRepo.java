package com.booking.animal.pawpalace.repos;

import com.booking.animal.pawpalace.entities.AnimalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalTypeRepo extends JpaRepository<AnimalType, Long> {
}
