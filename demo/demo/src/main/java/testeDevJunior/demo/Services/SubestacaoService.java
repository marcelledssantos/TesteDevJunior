package testeDevJunior.demo.Services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testeDevJunior.demo.Models.Subestacao;
import testeDevJunior.demo.Repositories.SubestacaoRepository;

import java.util.List;

@Service
public class SubestacaoService {

    @Autowired
    private SubestacaoRepository subestacaoRepository;

    public List<Subestacao> listar() {
        return subestacaoRepository.findAll();
    }
    @Transactional
    public Subestacao salvar(Subestacao subestacao) {
        return subestacaoRepository.save(subestacao);
    }
}
