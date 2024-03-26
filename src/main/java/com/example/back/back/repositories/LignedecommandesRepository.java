package com.example.back.back.repositories;

import com.example.back.back.entities.Lignedecommandes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LignedecommandesRepository extends JpaRepository<Lignedecommandes,Long> , CrudRepository<Lignedecommandes,Long> {
}
