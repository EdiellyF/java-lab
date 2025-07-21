package edu.java.edielly.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class ConverteDados implements IConverteDados {

    private ObjectMapper mapper = new ObjectMapper();

    public ConverteDados() {
    }


    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        }catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
    }
}
