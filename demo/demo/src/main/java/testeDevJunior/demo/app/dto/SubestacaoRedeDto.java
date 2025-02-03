package testeDevJunior.demo.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubestacaoRedeDto {

    private int id;

    public SubestacaoRedeDto() {}

    public SubestacaoRedeDto(int id) {
        this.id = id;
    }
}
