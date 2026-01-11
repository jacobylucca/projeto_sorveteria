package com.sorveteria.Sorvete;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SorveteRepository extends JpaRepository<Sorvete, Long>{
}