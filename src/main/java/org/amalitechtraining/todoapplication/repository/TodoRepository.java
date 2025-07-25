package org.amalitechtraining.todoapplication.repository;

import org.amalitechtraining.todoapplication.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
