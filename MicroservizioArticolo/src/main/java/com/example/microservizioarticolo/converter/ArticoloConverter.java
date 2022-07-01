package com.example.microservizioarticolo.converter;



import com.example.microservizioarticolo.articoloDto.ArticoloDto;
import com.example.microservizioarticolo.entity.Articolo;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


@Component
public class ArticoloConverter {

    public List<ArticoloDto> converterArticolo(List<Articolo> corsi){

        List<ArticoloDto> listaDto=new ArrayList<ArticoloDto>();
        for(Articolo a: corsi){
            ArticoloDto a1=new ArticoloDto();
            a1.setNomeArticolo(a.getNomeArticolo());
            a1.setPrezzo(a.getPrezzo());
            a1.setTestoRecensione(a.getTestoRecensione());
            listaDto.add(a1);
        }
        return listaDto;
    }
}
