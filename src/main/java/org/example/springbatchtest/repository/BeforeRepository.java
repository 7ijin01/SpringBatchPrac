package org.example.springbatchtest.repository;

import org.aspectj.lang.annotation.Before;
import org.example.springbatchtest.entity.BeforeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeforeRepository extends JpaRepository<BeforeEntity, Long>
{

}
