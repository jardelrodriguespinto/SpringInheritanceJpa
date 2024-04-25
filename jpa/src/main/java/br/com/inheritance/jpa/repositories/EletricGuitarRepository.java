package br.com.inheritance.jpa.repositories;

import br.com.inheritance.jpa.jointable.EletricGuitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EletricGuitarRepository extends JpaRepository<EletricGuitar, Long> {
}
