package testeDevJunior.demo.Dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class RedeMTDto {

    private String codigo;
    private String nome;
    private BigDecimal tensaoNominal;
    private SubestacaoDto subestacao;

    public RedeMTDto(String codigo, String nome, BigDecimal tensaoNominal, SubestacaoDto subestacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.tensaoNominal = tensaoNominal;
        this.subestacao = subestacao;
    }
}
