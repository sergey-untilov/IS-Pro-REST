package ua.in.d6.service;

import ua.in.d6.domain.firm.Company;

public interface CompanyService {
    Company findById(Long id);
    Company findFirst();
}
