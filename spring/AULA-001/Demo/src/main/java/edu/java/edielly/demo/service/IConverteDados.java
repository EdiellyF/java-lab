package edu.java.edielly.demo.service;

public interface IConverteDados {


    <T> T obterDados(String json, Class<T> classe);
}
