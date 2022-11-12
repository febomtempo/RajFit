package exception;

import java.io.IOException;

public class ErroDeGravacaoException extends IOException {

    public ErroDeGravacaoException() {
	super("Erro ao gravar dados!");
    }
    
}
