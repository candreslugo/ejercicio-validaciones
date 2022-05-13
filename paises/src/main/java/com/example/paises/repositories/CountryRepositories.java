package com.example.paises.repositories;

import com.example.paises.models.CitiesModel;
import com.example.paises.models.CountryModel;
import com.example.paises.models.DepartmentModel;
import com.example.paises.models.PaisModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface CountryRepositories extends CrudRepository<CountryModel,Long> {

    public abstract  CountryModel findByCountry(String country);
    public abstract ArrayList<CountryModel> findByPais(PaisModel pais);
    public abstract ArrayList<CountryModel> findByDepartment(DepartmentModel department);
    public abstract ArrayList<CountryModel> findByCities(CitiesModel cities);


}
