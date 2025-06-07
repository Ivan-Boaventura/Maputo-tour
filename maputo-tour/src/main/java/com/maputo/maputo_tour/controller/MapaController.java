package com.maputo.maputo_tour.controller;

import com.maputo.maputo_tour.repository.PontoTuristicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapaController {

    @Autowired
    private PontoTuristicoRepository pontoRepo;

    @GetMapping("/mapa")
    public String exibirMapa(Model model) {
        model.addAttribute("pontos", pontoRepo.findAll());
        return "mapa";
    }
}
