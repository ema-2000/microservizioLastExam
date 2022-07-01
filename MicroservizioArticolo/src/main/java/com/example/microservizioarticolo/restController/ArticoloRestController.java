package com.example.microservizioarticolo.restController;

import com.example.microservizioarticolo.articoloDto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import com.example.microservizioarticolo.recensioneClient.RecensioneClient;
import com.example.microservizioarticolo.service.ArticoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticoloRestController {

    @Autowired
    ArticoloService articoloService;

    @Autowired
    RecensioneClient recensioneClient;


    @PostMapping(value = "/creaArticolo")
    public void saveNewArticolo(@RequestBody Articolo articolo, @RequestParam Long idRecensione){

        String testoRecensione = recensioneClient.getTestoRecensione(idRecensione);


        articolo.setTestoRecensione(testoRecensione);
        articolo.setIdRecensione(idRecensione);

        articoloService.saveArticolo(articolo);
        System.out.println("Articolo salvato");
    }

    @GetMapping(value="/listaArticoli")
    public List<ArticoloDto> getArticolo(){

        return articoloService.findAll();
    }

    @PutMapping(value="/modificaArticolo")
    public String updateDocente(@RequestBody Articolo articolo){

            articoloService.saveArticolo(articolo);
        return "articolo modificato";
    }

    @DeleteMapping(value="/eliminaArticolo")
    public String deleteDocente(@RequestParam Long id){

        articoloService.deleteById(id);
        return "Articolo eliminato";
    }
}
