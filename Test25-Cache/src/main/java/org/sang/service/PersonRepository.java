package org.sang.service;

import org.sang.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sang on 17-1-6.
 */
public interface PersonRepository extends JpaRepository<Person,Long> {
}
