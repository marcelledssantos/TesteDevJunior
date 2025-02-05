package testeDevJunior.demo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testeDevJunior.demo.app.dto.EntradaDadosSubReDto;
import testeDevJunior.demo.app.dto.RedeMTDto;
import testeDevJunior.demo.app.services.EntradaDadosServices;
import testeDevJunior.demo.domain.RedeMT;
import testeDevJunior.demo.domain.Subestacao;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/entrada")
public class EntradaDdosController {

    @Autowired
    private EntradaDadosServices entradaDadosService;

    @PostMapping
    public ResponseEntity<String> salvarEntradaDados(@RequestBody EntradaDadosSubReDto dto) {
        entradaDadosService.salvarEntradaDados(dto);
        return ResponseEntity.ok("Subestação e redes salvas com sucesso!");
    }
}