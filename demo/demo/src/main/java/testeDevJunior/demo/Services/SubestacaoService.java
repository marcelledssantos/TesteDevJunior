package testeDevJunior.demo.Services;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testeDevJunior.demo.Dto.SubestacaoDto;
import testeDevJunior.demo.Models.Subestacao;
import testeDevJunior.demo.Repositories.SubestacaoRepository;

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

    public SubestacaoDto salvar(SubestacaoDto subestacaoDto) {
        Subestacao subestacao = paraSubestacaoDto(subestacaoDto);
        Subestacao saved = subestacaoRepository.save(subestacao);
        return paraDto(saved);
    }
}
