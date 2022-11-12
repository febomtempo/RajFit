package io;

import exception.ErroDeGravacaoException;

public interface Gravacao<T> {
    
    public abstract void gravarDados(T objeto, String path) throws ErroDeGravacaoException;

}
