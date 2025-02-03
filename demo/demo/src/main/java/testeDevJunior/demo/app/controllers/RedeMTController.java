package testeDevJunior.demo.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testeDevJunior.demo.app.dto.RedeMTDto;
import testeDevJunior.demo.domain.RedeMT;
import testeDevJunior.demo.app.services.RedeMTService;

import java.util.List;

@RestController
@RequestMapping("/RedesMT")
public class RedeMTController {

    private RedeMTService redeMTService;

    @Autowired
    public RedeMTController(RedeMTService redeMTService) {
        this.redeMTService = redeMTService;
    }

    @GetMapping
    public List<RedeMT> listar() {
        return redeMTService.listar();
    }

    @PostMapping
    public ResponseEntity<RedeMTDto> save(@RequestBody RedeMTDto redeMTDto) {
        RedeMTDto redeMT = redeMTService.save(redeMTDto);
        return ResponseEntity.ok(redeMT);
    }
}

