package testeDevJunior.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testeDevJunior.demo.Models.RedeMT;
import testeDevJunior.demo.Models.Subestacao;
import testeDevJunior.demo.Repositories.RedeMTRepository;
import testeDevJunior.demo.Repositories.SubestacaoRepository;

import java.util.List;

@Service
public class RedeMTService {

    @Autowired
    private final RedeMTRepository redeMTRepository;
    private final SubestacaoRepository subestacaoRepository;

    public RedeMTService(RedeMTRepository redeMTRepository, SubestacaoRepository subestacaoRepository) {
        this.redeMTRepository = redeMTRepository;
        this.subestacaoRepository = subestacaoRepository;
    }

    public List<RedeMT> listar() {
        return redeMTRepository.findAll();
    }

    public RedeMT save(RedeMT redeMT) {Subestacao subestacao = subestacaoRepository.findById(redeMT.getSubestacao().getId())
                .orElseThrow(() -> new RuntimeException("Subestação não encontrada"));

        redeMT.setSubestacao(subestacao);
        return redeMTRepository.save(redeMT);
    }
}

