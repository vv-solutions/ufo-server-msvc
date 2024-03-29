package dk.vv.ufo.server.msvc.grpc;

import dk.vv.ufo.server.msvc.dtos.DataDTO;
import dk.vv.ufo.server.msvc.util.DataGenerator;
import io.grpc.stub.StreamObserver;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class DataGrpcService implements DataGrpc {

    private final DataGenerator dataGenerator;

    @Inject
    public DataGrpcService(DataGenerator dataGenerator) {
        this.dataGenerator = dataGenerator;
    }

//    @Override
//    public Uni<DataCollection> getData(Empty request) {
//
//        return Uni.createFrom().item(mapToDataCollection(dataGenerator.generateData()));
//    }
//
//
//    private DataCollection mapToDataCollection(List<DataDTO> list) {
//        DataCollection.Builder builder =
//                DataCollection.newBuilder();
//        list.forEach(d -> builder.addData((mapToData(d))));
//        return builder.build();
//    }
//
//    private Data mapToData(DataDTO dataDTO) {
//        Data.Builder builder =
//                Data.newBuilder();
//        if (dataDTO != null) {
//            return builder
//                    .setStringData(dataDTO.getStringData())
//                    .setBooleanData(dataDTO.isBooleanData())
//                    .setIntegerData(dataDTO.getIntegerData())
//                    .setFloatData(dataDTO.getFloatData())
//                    .build();
//        } else {
//            return null;
//        }
//    }

    @Override
    public Uni<DataCollection> getData(Empty request) {
        return Uni.createFrom().item(dataGenerator.generateDataCollection());
    }

    @Override
    public Uni<Data> getDataSingle(Empty request) {
        return Uni.createFrom().item(dataGenerator.generateDataSingle()
        );
    }




    private DataCollection mapToDataCollection(List<DataDTO> list) {
        DataCollection.Builder builder = DataCollection.newBuilder();
        list.stream()
                .map(this::mapToData)
                .forEach(builder::addData);
        return builder.build();
    }

    private Data mapToData(DataDTO dataDTO) {
        if (dataDTO != null) {
            return Data.newBuilder()
                    .setStringData(dataDTO.getStringData())
                    .setBooleanData(dataDTO.isBooleanData())
                    .setIntegerData(dataDTO.getIntegerData())
                    .setFloatData(dataDTO.getFloatData())
                    .build();
        } else {
            return null;
        }
    }
}
