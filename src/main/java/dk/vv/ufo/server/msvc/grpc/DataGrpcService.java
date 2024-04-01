package dk.vv.ufo.server.msvc.grpc;

import dk.vv.ufo.server.msvc.util.DataGenerator;
import dk.vv.ufo.server.msvc.util.FIleReaderUtil;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class DataGrpcService implements DataGrpc {


    private static final List<ComplexObject> complexObjects = new ArrayList<>();

    private DataGenerator dataGenerator = new DataGenerator();


    public DataGrpcService() {
        // on initialize create 100001 complex obejcts
        complexObjects.addAll(dataGenerator.generateComplexObjects(100000));
    }

    @Override
    public Uni<NumberResponse> getNumber(Number request) {

        var builder = NumberResponse.newBuilder();
        for (int i = 0; i < request.getData(); i++) {
            builder.addData(i);
        }

        return Uni.createFrom().item(builder.build());
    }


    @Override
    public Uni<ComplexObjectResponse> getComplexData(ComplexObjectRequest request) {
        return Uni.createFrom().item(ComplexObjectResponse.newBuilder()
                .addAllComplexObject(complexObjects.subList(0,request.getCount())).build());
    }
}
