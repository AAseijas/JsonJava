import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectToJson {
    public static void main(String[] args) throws IOException {
        Persona p1 = new Persona("Alex", "Perez", 22);
        Persona p2 = new Persona("Juan", "Sanchez", 42);
        Persona p3 = new Persona("Carlos", "Martinez", 52);

        List<Persona> personasDB = new ArrayList<>();

        personasDB.add(p1);
        personasDB.add(p2);
        personasDB.add(p3);

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(new File("./data.json"), personasDB); // -->Crea un Archivo

        /** String dataJson = mapper.writeValueAsString(p1);  //Transforma el obj a Json y lo guarda en un String

         System.out.println(dataJson);**/
    }
}
