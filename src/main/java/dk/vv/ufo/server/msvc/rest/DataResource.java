package dk.vv.ufo.server.msvc.rest;

import dk.vv.ufo.server.msvc.dtos.ComplexDTO;
import dk.vv.ufo.server.msvc.util.DataGenerator;
import dk.vv.ufo.server.msvc.util.FIleReaderUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.cache.NoCache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped

@Consumes("application/json")
@Produces(MediaType.APPLICATION_JSON)
@Path("/api/")
public class DataResource {

    private static final List<ComplexDTO> complexDTOS = new ArrayList<>();

    private DataGenerator dataGenerator = new DataGenerator();
    public DataResource() {
        // on initialize create 100001 complex dtos
        complexDTOS.addAll(dataGenerator.generateComplexDtos(100001));
    }


    @GET
    @Path("/number/{count}")
    @NoCache
    public List<Integer> getNumber(@PathParam("count") int count){

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(i);
        }
        return numbers;
    }


    @GET
    @NoCache
    @Path("/complex/{count}")
    public List<ComplexDTO> getComplexDtos(@PathParam("count") int count){
        return complexDTOS.subList(0,count);
    }
}
