//package dk.vv.ufo.server.msvc;
//
//import dk.vv.ufo.server.msvc.grpc.DataGrpcService;
//import dk.vv.ufo.server.msvc.util.DataGenerator;
//import jakarta.enterprise.context.ApplicationScoped;
//import jakarta.enterprise.inject.Produces;
//
//@ApplicationScoped
//public class Producers {
//
//    @Produces
//    DataGenerator getDataGenerator(){
//        return new DataGenerator();
//    }
//
//
//    @Produces
//    DataGrpcService dataGrpcService(DataGenerator dataGenerator){
//        return new DataGrpcService(dataGenerator);
//    }
//
//}
