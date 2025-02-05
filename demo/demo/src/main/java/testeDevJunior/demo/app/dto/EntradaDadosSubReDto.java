package testeDevJunior.demo.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntradaDadosSubReDto {

    @JsonIgnore
    private Integer id;

    private String codigo;
    private String nome;
    private BigDecimal latitude;
    private BigDecimal longitude;

    private List<RedeMTDto> Redes;
}
