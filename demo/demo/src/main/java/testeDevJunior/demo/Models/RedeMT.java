package testeDevJunior.demo.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TB_REDE_MT")
public class RedeMT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REDE_MT")
    private Integer id;

    @Column(name = "CODIGO", nullable = false, length = 5, unique = true, updatable = false)
    private String codigo;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "TENSAO_NOMINAL", precision = 5, scale = 2)
    private BigDecimal tensaoNominal;

    @ManyToOne
    @JoinColumn(name = "ID_SUBESTACAO", nullable = false)
    private Subestacao subestacao;

}
