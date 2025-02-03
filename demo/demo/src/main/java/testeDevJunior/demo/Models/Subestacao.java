package testeDevJunior.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "TB_SUBESTACAO")
public class Subestacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBESTACAO")
    private Integer id;

    @Column(name = "CODIGO", nullable = false, length = 3, unique = true, updatable = false)
    private String codigo;

    @Column(name = "NOME", nullable = false, length = 100)
    private String nome;

    @Column(name = "LATITUDE", precision = 15, scale = 13)
    private BigDecimal latitude;

    @Column(name = "LONGITUDE", precision = 15, scale = 13)
    private BigDecimal longitude;

    @JsonIgnore
    @OneToMany(mappedBy = "subestacao", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<RedeMT> redes;

}