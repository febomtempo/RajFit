package io;

import exception.ErroDeLeituraException;

public class Carregador {
    
    public static Object carregarDados(Leitura arq, String path) throws ErroDeLeituraException {
	return arq.lerDados(path);
    }
    
}
