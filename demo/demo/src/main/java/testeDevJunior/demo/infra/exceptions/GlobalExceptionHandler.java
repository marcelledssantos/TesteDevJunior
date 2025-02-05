package testeDevJunior.demo.infra.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


    public class GlobalExceptionHandler {

        @ExceptionHandler(CodigoJaExisteException.class)
        public ResponseEntity<Map<String, Object>> handleCodigoJaExisteException(CodigoJaExisteException ex) {
            Map<String, Object> response = new HashMap<>();
            response.put("timestamp", LocalDateTime.now());
            response.put("status", HttpStatus.BAD_REQUEST.value());
            response.put("error", "Código Duplicado");
            response.put("message", ex.getMessage());

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }
    }

