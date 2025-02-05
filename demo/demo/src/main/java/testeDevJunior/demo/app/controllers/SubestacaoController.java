package testeDevJunior.demo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testeDevJunior.demo.app.dto.EntradaDadosSubReDto;
import testeDevJunior.demo.app.services.EntradaDadosServices;
import testeDevJunior.demo.domain.Subestacao;
import testeDevJunior.demo.app.services.SubestacaoService;

import java.util.List;

@RestController
@RequestMapping("/subestacoes")
@CrossOrigin
public class SubestacaoController {

        @Autowired
        private SubestacaoService subestacaoService;

        @Autowired
        private EntradaDadosServices entradaDadosServices;

        @GetMapping
        public List<Subestacao> listar() {
            return subestacaoService.listar();
        }
        @PostMapping
        public ResponseEntity<String> salvarEntradaDados(@RequestBody EntradaDadosSubReDto dto) {
                entradaDadosServices.salvarEntradaDados(dto);
                return ResponseEntity.ok("Subestação e redes salvas com sucesso!");
        }
}

