package testeDevJunior.demo.app.services;

import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testeDevJunior.demo.app.dto.RedeMTDto;
import testeDevJunior.demo.domain.RedeMT;
import testeDevJunior.demo.domain.Subestacao;

import testeDevJunior.demo.app.repositories.SubestacaoRepository;

import java.util.List;

@Service
public class RedeMTService {

    @Autowired
    private testeDevJunior.demo.app.repositories.RedeMTRepository redeMTRepository;

    @Autowired
    private  SubestacaoRepository subestacaoRepository;

    @Autowired
    private ModelMapper mapper;

    private RedeMT paraRedeMT(RedeMTDto redeMTDto) {
        return mapper.map(redeMTDto, RedeMT.class);
    }

    private RedeMTDto paraDto(RedeMT redeMT) {
        return mapper.map(redeMT, RedeMTDto.class);
    }

    public RedeMTService(testeDevJunior.demo.app.repositories.RedeMTRepository redeMTRepository, SubestacaoRepository subestacaoRepository) {
        this.redeMTRepository = redeMTRepository;
        this.subestacaoRepository = subestacaoRepository;
    }

    public List<RedeMT> listar() {
        return redeMTRepository.findAll();
    }

    @Transactional
    public RedeMTDto save(RedeMTDto redeMTDto) {

        Subestacao subestacao = subestacaoRepository.findById(redeMTDto.getSubestacao().getId())
                .orElseThrow(() -> new RuntimeException("Subestação não encontrada"));
        RedeMT redeMT = paraRedeMT(redeMTDto);
        redeMT.setSubestacao(subestacao);
        RedeMT saved = redeMTRepository.save(redeMT);

        return paraDto(saved);
    }
}

