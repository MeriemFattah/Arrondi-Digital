package me.haitammk.citoyenconnect.citoyen;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CitoyenRepository extends JpaRepository<Citoyen, String> {

    @Query("SELECT c FROM Citoyen c WHERE c.code_conf = :code_conf AND c.cin = :cin")
    Citoyen findByCode_confAndCin(@Param("cin") String cin, @Param("code_conf") String code_conf);
}
