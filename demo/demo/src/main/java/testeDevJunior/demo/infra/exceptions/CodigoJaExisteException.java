package testeDevJunior.demo.infra.exceptions;

public class CodigoJaExisteException extends RuntimeException {
        public CodigoJaExisteException(String mensagem) {
            super(mensagem);
        }
    }

