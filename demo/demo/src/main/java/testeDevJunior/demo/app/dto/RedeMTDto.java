package testeDevJunior.demo.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
public class RedeMTDto {

    @JsonIgnore
    private Integer id;

    private String codigo;
    private String nome;
    private BigDecimal tensaoNominal;
    private testeDevJunior.demo.app.dto.SubestacaoRedeDto subestacao;

    public RedeMTDto() {}

    public RedeMTDto(String codigo, String nome, BigDecimal tensaoNominal, testeDevJunior.demo.app.dto.SubestacaoRedeDto subestacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.tensaoNominal = tensaoNominal;
        this.subestacao = subestacao;
    }
}