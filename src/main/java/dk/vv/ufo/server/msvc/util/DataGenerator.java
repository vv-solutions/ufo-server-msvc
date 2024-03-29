package dk.vv.ufo.server.msvc.util;
import dk.vv.ufo.server.msvc.dtos.DataDTO;
import dk.vv.ufo.server.msvc.grpc.Data;
import dk.vv.ufo.server.msvc.grpc.DataCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.random.*;


public class DataGenerator {
    public List<DataDTO> generateDataDTOS(){

        Random random = new Random();

        List <DataDTO> dataDTOS = new ArrayList<>();


        for (int i = 0; i < 10000; i++) {
            dataDTOS.add(new DataDTO(){{
                this.setIntegerData(random.nextInt(9999));
                this.setBooleanData(random.nextBoolean());
                this.setStringData(UUID.randomUUID().toString());
                this.setFloatData(random.nextFloat());
            }});
        }

        return dataDTOS;
    }


    public DataDTO generateDataDTO(){
        Random random = new Random();
        return new DataDTO(){{
            this.setIntegerData(random.nextInt(9999));
            this.setBooleanData(random.nextBoolean());
            this.setStringData(UUID.randomUUID().toString());
            this.setFloatData(random.nextFloat());
        }};
    }

    public DataCollection generateDataCollection(){

        Random random = new Random();

        DataCollection.Builder builder = DataCollection.newBuilder();


        for (int i = 0; i < 10000; i++) {
            builder.addData(Data.newBuilder()
                    .setIntegerData(random.nextInt(9999))
                    .setBooleanData(random.nextBoolean())
                    .setFloatData(random.nextFloat())
                    .setStringData(UUID.randomUUID().toString()).build());
        }

        return builder.build();

    }

    public Data generateDataSingle(){

        Random random = new Random();


            return Data.newBuilder()
                    .setIntegerData(random.nextInt(9999))
                    .setBooleanData(random.nextBoolean())
                    .setFloatData(random.nextFloat())
                    .setStringData(UUID.randomUUID().toString()).build();



    }
}
