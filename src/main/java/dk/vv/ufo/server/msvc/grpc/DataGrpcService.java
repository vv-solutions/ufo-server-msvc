package dk.vv.ufo.server.msvc.grpc;

import dk.vv.ufo.server.msvc.util.FIleReaderUtil;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class DataGrpcService implements DataGrpc {


    @Override
    public Uni<number> getNumber(number request) {
        return Uni.createFrom().item(request);
    }

    @Override
    public Uni<text> getText(empty request)  {
        try
        {
        return Uni.createFrom().item(text.newBuilder().setData(FIleReaderUtil.ReadFile("data/1MiB.txt")).build());

        } catch (Exception e){
            throw new RuntimeException();
        }
    }
}
