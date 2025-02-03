package testeDevJunior.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testeDevJunior.demo.Dto.RedeMTDto;
import testeDevJunior.demo.Models.RedeMT;
import testeDevJunior.demo.Services.RedeMTService;

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

