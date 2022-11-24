package org.home.companyservice.dao;

import org.home.companyservice.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource // exposer le web services, tous le méthodes dans l'interface sont accessible via des WS
public interface CompanyRepository extends JpaRepository<Company, Long> {
}
