package testeDevJunior.demo.app.services;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testeDevJunior.demo.app.dto.EntradaDadosSubReDto;
import testeDevJunior.demo.app.repositories.SubestacaoRepository;
import testeDevJunior.demo.domain.RedeMT;
import testeDevJunior.demo.domain.Subestacao;
import testeDevJunior.demo.infra.exceptions.CodigoJaExisteException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntradaDadosServices {

    @Autowired
    private SubestacaoRepository subestacaoRepository;

    @Transactional
    public void salvarEntradaDados(EntradaDadosSubReDto dto) {

        boolean codigoExiste = subestacaoRepository.existsByCodigo(dto.getCodigo());
        if (codigoExiste) {
            throw new CodigoJaExisteException("Código da subestação já existe");
        }
        Subestacao subestacao = new Subestacao();
        subestacao.setCodigo(dto.getCodigo());
        subestacao.setNome(dto.getNome());
        subestacao.setLatitude(dto.getLatitude());
        subestacao.setLongitude(dto.getLongitude());

        List<RedeMT> redes = dto.getRedes().stream().map(redeDto -> {
            RedeMT rede = new RedeMT();
            rede.setCodigo(redeDto.getCodigo());
            rede.setNome(redeDto.getNome());
            rede.setTensaoNominal(redeDto.getTensaoNominal());
            rede.setSubestacao(subestacao);
            return rede;
        }).collect(Collectors.toList());
        subestacao.setRedes(redes);

        subestacaoRepository.save(subestacao);
    }
}
