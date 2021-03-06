package org.tritux.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tritux.entites.Profil;

@Repository
public interface ProfilRepo extends JpaRepository<Profil, Long> {

}
