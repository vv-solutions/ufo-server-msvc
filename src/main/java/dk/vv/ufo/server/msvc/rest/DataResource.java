package dk.vv.ufo.server.msvc.rest;

import dk.vv.ufo.server.msvc.dtos.NumberDTO;
import dk.vv.ufo.server.msvc.dtos.TextDTO;
import dk.vv.ufo.server.msvc.util.FIleReaderUtil;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.jboss.resteasy.annotations.cache.NoCache;

import java.io.IOException;

@ApplicationScoped

@Consumes("application/json")
@Produces(MediaType.APPLICATION_JSON)
@Path("/api/")
public class DataResource {

    @GET
    @Path("/number/{number}")
    public NumberDTO getNumber(@PathParam("number") int number){
        return new NumberDTO(number);
    }

    @GET
    @Path("/text/")
    @NoCache
    public TextDTO getText() throws IOException {
        return new TextDTO(FIleReaderUtil.ReadFile("data/1MiB.txt"));
    }
}
