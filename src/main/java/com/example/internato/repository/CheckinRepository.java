package com.example.internato.repository;

import com.example.internato.entity.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="checkins")
public interface CheckinRepository extends JpaRepository<Checkin, Long> {}
