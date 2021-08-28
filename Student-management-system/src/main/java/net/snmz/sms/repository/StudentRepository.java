package net.snmz.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.snmz.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{


}
