package com.example.microserviziorecensione.recensioneRestController;

import com.example.microserviziorecensione.entity.Recensione;
import com.example.microserviziorecensione.service.RecensioneService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/")
public class RecensioneRestController {

    @Autowired
    RecensioneService recensioneService;


    @GetMapping(value = "getTestoById")
    public String getTestoById(@RequestParam Long id){

        return recensioneService.getTestoById(id);
    }

    @GetMapping(value="listaRecensioni")
    public List<Recensione> getRecensioni(){
        return recensioneService.findAll();
    }

    @PostMapping(value="creaRecensione")
    public String addDocente(@RequestBody Recensione recensione){

        recensioneService.save(recensione);
        return "Recensione salvata";
    }

    @DeleteMapping(value="eliminaRecensione")
    public String deleteDocente(@RequestParam Long id){

        recensioneService.deleteById(id);
        return "Recensione eliminata";
    }

    @PutMapping(value="modificaRecensione")
    public String updateDocente(@RequestBody Recensione recensione){

        if((Object)recensioneService.findById(recensione.getId())!=null && recensione.getId()!=null)
            recensioneService.save(recensione);
        return "recensione modificata";
    }
}
