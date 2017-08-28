package ua.in.d6.repository.firm;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.in.d6.domen.firm.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Company findById(Long id);
}
