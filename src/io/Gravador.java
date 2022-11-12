package io;

import exception.ErroDeGravacaoException;

public class Gravador {
    
    public static void gravarDados(Gravacao arq, Object objeto, String path) throws ErroDeGravacaoException {
	arq.gravarDados(objeto, path);
    }

}
