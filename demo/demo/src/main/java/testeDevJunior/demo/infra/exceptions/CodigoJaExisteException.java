package testeDevJunior.demo.infra.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CodigoJaExisteException extends RuntimeException {
        public CodigoJaExisteException(String mensagem) {
            super(mensagem);
        }
    }

