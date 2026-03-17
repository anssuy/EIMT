package mk.ukim.finki.emt.lab.service.domain;

import mk.ukim.finki.emt.lab.model.domain.Country;

import java.util.List;

public interface CountryService {
    Country findById(Long id);

    List<Country> findAll();

    Country create(Country country);

    Country update(Long id, Country country);

    Country deleteById(Long id);
}
