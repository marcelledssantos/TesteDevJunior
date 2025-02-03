package testeDevJunior.demo.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class SubestacaoDto {

    @JsonIgnore
    private Integer id;

    private String codigo;
    private String nome;
    private BigDecimal latitude;
    private BigDecimal longitude;

    public SubestacaoDto() {}

    public SubestacaoDto(String codigo, String nome, BigDecimal latitude, BigDecimal longitude) {
        this.codigo = codigo;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
