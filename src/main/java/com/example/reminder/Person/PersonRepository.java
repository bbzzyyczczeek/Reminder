package com.example.reminder.Person;

import org.springframework.data.repository.CrudRepository;


import java.util.Optional;


public interface PersonRepository extends CrudRepository<Person,Long> {
    Optional<Person> findByLastName(String lastName);

}
