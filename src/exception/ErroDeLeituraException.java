package exception;

import java.io.IOException;

public class ErroDeLeituraException extends IOException {

    public ErroDeLeituraException() {
	super("Erro ao ler dados!");
    }
    
}
