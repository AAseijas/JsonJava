import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonToObject {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

       String strJson = "{\"name\":\"Alex\",\"apellido\":\"Perez\",\"edad\":22}";
        Persona persona = mapper.readValue(new File("./data.json"), Persona.class);


        System.out.println(persona); //Leer desde un String.

        /** Persona persona = mapper.readValue(new File("./data.json"),Persona.class);
         System.out.println(persona);**/ //Leer desde un archivo. Solucionar el problema de leer array


    }
}
