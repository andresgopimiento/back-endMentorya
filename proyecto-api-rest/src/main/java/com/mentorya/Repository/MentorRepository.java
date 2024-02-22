package com.mentorya.Repository;

import com.mentorya.Entity.MentorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MentorRepository extends JpaRepository<MentorEntity, Long> {
}
