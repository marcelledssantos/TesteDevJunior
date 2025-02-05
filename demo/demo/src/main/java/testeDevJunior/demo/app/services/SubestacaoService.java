package testeDevJunior.demo.app.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import testeDevJunior.demo.app.dto.SubestacaoDto;
import testeDevJunior.demo.domain.Subestacao;
import testeDevJunior.demo.app.repositories.SubestacaoRepository;
import testeDevJunior.demo.infra.exceptions.CodigoJaExisteException;

import java.util.List;

@Service
public class SubestacaoService {

    @Autowired
    private SubestacaoRepository subestacaoRepository;

    @Autowired
    private ModelMapper mapper;

    private SubestacaoDto paraDto(Subestacao subestacao) {
        return mapper.map(subestacao, SubestacaoDto.class);
    }

    private Subestacao paraSubestacaoDto(SubestacaoDto subestacaoDto) {
        return mapper.map(subestacaoDto, Subestacao.class);
    }

    public List<Subestacao> listar() {
        return subestacaoRepository.findAll();
    }

    @Transactional
    public SubestacaoDto salvar(SubestacaoDto subestacaoDto) {
        Subestacao subestacao = paraSubestacaoDto(subestacaoDto);
        if (subestacaoRepository.existsByCodigo(subestacao.getCodigo())) {
            throw new CodigoJaExisteException("Código da subestação já existe");
        }
        Subestacao saved = subestacaoRepository.save(subestacao);
        return paraDto(saved);
    }
}
