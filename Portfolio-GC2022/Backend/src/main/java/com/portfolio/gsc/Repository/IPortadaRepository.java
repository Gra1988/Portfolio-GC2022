
package com.portfolio.gsc.Repository;

import com.portfolio.gsc.Entity.Portada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPortadaRepository extends JpaRepository<Portada,Long>{
    
}
