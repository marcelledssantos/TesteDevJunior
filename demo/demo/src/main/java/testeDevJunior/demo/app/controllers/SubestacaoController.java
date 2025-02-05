package testeDevJunior.demo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testeDevJunior.demo.app.dto.SubestacaoDto;
import testeDevJunior.demo.domain.Subestacao;
import testeDevJunior.demo.app.services.SubestacaoService;

import java.util.List;

@RestController
@RequestMapping("/subestacoes")
@CrossOrigin
public class SubestacaoController {

        @Autowired
        private SubestacaoService subestacaoService;

        @GetMapping
        public List<Subestacao> listar() {
            return subestacaoService.listar();
        }

        @PostMapping
        public ResponseEntity<SubestacaoDto> salvar(@RequestBody SubestacaoDto subestacaoDto) {
            SubestacaoDto subestacao = subestacaoService.salvar(subestacaoDto);
            return ResponseEntity.ok(subestacaoService.salvar(subestacao));
        }
    }

