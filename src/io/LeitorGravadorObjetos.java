package io;

import exception.ErroDeGravacaoException;
import exception.ErroDeLeituraException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LeitorGravadorObjetos<T> implements Leitura<T>, Gravacao<T> {

    @Override
    public void gravarDados(T objeto, String path) throws ErroDeGravacaoException {
	File dir = new File("./dados");
	if(!dir.exists()) {
	    dir.mkdir();
	}
	
	ObjectOutputStream out = null;
	
	try {
	    out = new ObjectOutputStream(new FileOutputStream("./dados/" + path));
	    out.writeObject(objeto);
	} catch (IOException ex) {
	    throw new ErroDeGravacaoException();
	} finally {
	    try {
		out.close();
	    } catch (IOException ex) {
		throw new ErroDeGravacaoException();
	    }
	}
    }

    @Override
    public T lerDados(String path) throws ErroDeLeituraException {
	File arq = new File("./dados/" + path);
	if(!arq.exists()) {
	    return null;
	}
	
	ObjectInputStream in = null;
	try {
	    in = new ObjectInputStream(new FileInputStream(arq));
	    return (T) in.readObject();
	} catch (IOException ex) {
	    throw new ErroDeLeituraException();
	} catch (ClassNotFoundException ex) {
	    throw new ErroDeLeituraException();
	} finally {
	    try {
		in.close();
	    } catch (IOException ex) {
		throw new ErroDeLeituraException();
	    }
	}
    }
    
}
