package io;

import exception.ErroDeLeituraException;

public interface Leitura<T> {
    
    public abstract T lerDados(String path) throws ErroDeLeituraException;
    
}
