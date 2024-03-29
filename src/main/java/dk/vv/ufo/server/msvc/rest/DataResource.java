package dk.vv.ufo.server.msvc.rest;

import dk.vv.ufo.server.msvc.dtos.DataDTO;
import dk.vv.ufo.server.msvc.util.DataGenerator;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.annotations.cache.NoCache;

import java.util.List;

@ApplicationScoped
@Produces("application/json")
@Consumes("application/json")
@Path("/api/")
public class DataResource {


    private final DataGenerator dataGenerator;


    @Inject
    public DataResource(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }


    @GET
    @Path("/data")
    public List<DataDTO> getData(){
        return dataGenerator.generateDataDTOS();
    }
    @GET
    @Path("/dataSingle")
    @NoCache
    public DataDTO getDataSingle(){
        return dataGenerator.generateDataDTO();
    }

    @GET
    @Path("/test")
    public Response getResource() { return Response.ok("{\"Hello\": \"REST!\"}").build(); }
}
