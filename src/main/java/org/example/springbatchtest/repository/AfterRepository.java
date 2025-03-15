package org.example.springbatchtest.repository;

import org.aspectj.lang.annotation.After;
import org.example.springbatchtest.entity.AfterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AfterRepository extends JpaRepository<AfterEntity, Long>
{
}
