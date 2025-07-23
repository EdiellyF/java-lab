package com.java.edu.edielly.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.edu.edielly.model.Tarefa;


import java.io.FileWriter;
import java.io.IOException;

//criar repositorio para lidar com as tarefas

public class ServiceDeTarefa {

    public void add(Tarefa tarefa) {

        ObjectMapper mapper = new ObjectMapper();
        String path = "tarefa.json";

        try {

            FileWriter fw = new FileWriter(path, true);
           String json = mapper.writeValueAsString(tarefa);
           fw.write(json);
           fw.write(System.lineSeparator()  );


           fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Erro ao criar o objeto: " + e.getMessage());
        }


    }
}
