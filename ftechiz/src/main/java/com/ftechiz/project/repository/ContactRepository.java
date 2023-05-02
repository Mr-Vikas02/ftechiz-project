package com.ftechiz.project.repository;

import com.ftechiz.project.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByAddressPostalCode(String postalCode);
}
