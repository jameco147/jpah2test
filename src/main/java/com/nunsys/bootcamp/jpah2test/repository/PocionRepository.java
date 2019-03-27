package com.nunsys.bootcamp.jpah2test.repository;


import com.nunsys.bootcamp.jpah2test.domain.Pocion;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Spring Data  repository for the Pocion entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PocionRepository extends JpaRepository<Pocion, Long> {

    List<Pocion> findByEsEpica(Boolean esEpica);
}