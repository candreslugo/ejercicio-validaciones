package com.example.paises.services;


import com.example.paises.models.CitiesModel;
import com.example.paises.models.CountryModel;
import com.example.paises.models.DepartmentModel;
import com.example.paises.models.PaisModel;
import com.example.paises.repositories.CountryRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CountryServices {

    @Autowired
    CountryRepositories countryRepositories;

    public ArrayList<CountryModel> gettingCountry() {
        return (ArrayList<CountryModel>) countryRepositories.findAll();
    }

    public CountryModel saveCountry(CountryModel country) {
        return countryRepositories.save(country);
    }

    public Optional<CountryModel> getForID(Long id){
        return countryRepositories.findById(id);
    }

    public ArrayList<CountryModel> getForCountry(PaisModel country){
        return countryRepositories.findByPais(country);
    }

    public ArrayList<CountryModel> getForPais(PaisModel pais){
        return countryRepositories.findByPais(pais);
    }

    public ArrayList<CountryModel> getForDepartment(DepartmentModel department){
        return countryRepositories.findByDepartment(department);
    }

    public ArrayList<CountryModel> getForCities(CitiesModel cities){
        return countryRepositories.findByCities(cities);
    }

    public boolean deleteForId(Long id){
        try {
            countryRepositories.deleteById(id);
            return true;
        }catch(Exception error){
            return false;
        }
    }
}
