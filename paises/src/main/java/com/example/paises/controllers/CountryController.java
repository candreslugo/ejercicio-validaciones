package com.example.paises.controllers;


import com.example.paises.models.CitiesModel;
import com.example.paises.models.CountryModel;
import com.example.paises.models.DepartmentModel;
import com.example.paises.models.PaisModel;
import com.example.paises.services.CountryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

    @RestController
    @RequestMapping("/country")
public class CountryController {
    @Autowired
    CountryServices countryServices;

    @GetMapping()
    public ArrayList<CountryModel> getting() {
        return countryServices.gettingCountry();
    }

    @PostMapping()
    public CountryModel savecountry(@RequestBody CountryModel country) {
        return this.countryServices.saveCountry(country);
    }

    @GetMapping("/{id}")
    public Optional<CountryModel> getForId(@PathVariable("id") Long id) {
        return this.countryServices.getForID(id);
    }

   /* @GetMapping("/query")
    public ArrayList<CountryModel> getForCountry(@RequestParam("pais") PaisModel country) {
        return this.countryServices.getForCountry(country);
    }

      @GetMapping("/query")
    public ArrayList<CountryModel> getForPais(@RequestParam("pais")PaisModel pais) {
        return this.countryServices.getForPais(pais);
    }

    @GetMapping("/query")
    public ArrayList<CountryModel> getForDepartment(@RequestParam("department") DepartmentModel department) {
        return this.countryServices.getForDepartment(department);
    }

    @ResponseBody
    @RequestMapping("/query")
    public ArrayList<CountryModel> getForCities(@RequestParam("cities") CitiesModel cities) {
        return this.countryServices.getForCities(cities);
    }*/

    @DeleteMapping("/{id}")
    public String deleteForId(@PathVariable("id") Long id) {
        boolean ok = this.countryServices.deleteForId(id);
        if (ok) {
            return "se elimino el pais con id " + id;
        } else {
            return "no se pudo eliminar el pais con id " + id;
        }
    }

}
