package com.github.mateuslses.citiesapi.countries;

import com.github.mateuslses.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
    }
