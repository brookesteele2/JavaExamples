package com.in28mintues.learnSpringBoot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28mintues.learnSpringBoot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
