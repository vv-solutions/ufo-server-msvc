package dk.vv.ufo.server.msvc.util;


import dk.vv.ufo.server.msvc.dtos.ComplexDTO;
import dk.vv.ufo.server.msvc.dtos.F97;
import dk.vv.ufo.server.msvc.dtos.F98;
import dk.vv.ufo.server.msvc.dtos.F99;
import dk.vv.ufo.server.msvc.grpc.ComplexObject;
import dk.vv.ufo.server.msvc.grpc.ComplexObjectResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    public List<ComplexDTO> generateComplexDtos(int count){
        List<ComplexDTO> complexDTOS = new ArrayList<>();

        for (int i = 0; i < count; i++) {
                List<F97> f97List = new ArrayList<>();
                List<F98> f98List = new ArrayList<>();
                List<F99> f99List = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                f97List.add(new F97(){{
                    setF1(true);
                    setF2("1");
                    setF3("1");
                    setF4(true);
                    setF5("1");
                    setF6("1");
                    setF7("1");
                }});

            }
            for (int j = 0; j < 10; j++) {
                f98List.add(new F98(){{
                    setF1(1f);
                    setF2(1f);
                    setF3(1f);
                    setF4(1f);
                    setF5(1f);
                    setF6(1);
                    setF7(1);
                }});

            }
            for (int j = 0; j < 10; j++) {
                f99List.add(new F99(){{
                    setF1(1);
                    setF2(1);
                    setF3(1);
                    setF4("1");
                    setF5("1");
                    setF6("1");
                    setF7("1");
                }});

            }


            complexDTOS.add(new ComplexDTO() {{
                setF1(1f);
                setF2(1f);
                setF3(1f);
                setF4("1");
                setF5(1);
                setF6("1");
                setF7(1);
                setF8("1");
                setF9("1");
                setF10("1");
                setF11(1);
                setF12(1);
                setF13(true);
                setF14(1);
                setF15(1);
                setF16(1f);
                setF17(1);
                setF18(1f);
                setF19(1f);
                setF20(1f);
                setF21("1");
                setF22(1);
                setF23(1d);
                setF24("1");
                setF25(1d);
                setF26(1d);
                setF27("1");
                setF28(1);
                setF29("1");
                setF30("1");
                setF31(1);
                setF32(1);
                setF33(true);
                setF34(1);
                setF35(1);
                setF36(1f);
                setF37(true);
                setF38(1f);
                setF39(1f);
                setF40(1f);
                setF41(1d);
                setF42("1");
                setF43(1d);
                setF44("1");
                setF45(1d);
                setF46("1");
                setF47(true);
                setF48("1");
                setF49("1");
                setF50("1");
                setF51(1);
                setF52(1d);
                setF53(1);
                setF54(1d);
                setF55(1);
                setF56(false);
                setF57(1f);
                setF58(1f);
                setF59(false);
                setF60(1f);
                setF61("1");
                setF62("1");
                setF63(1d);
                setF64(true);
                setF65("1");
                setF66(1d);
                setF67(true);
                setF68(1d);
                setF69("1");
                setF70("1");
                setF71(1);
                setF72(1);
                setF73(1);
                setF74(1);
                setF75(1);
                setF76(1f);
                setF77(1f);
                setF78(1f);
                setF79(1f);
                setF80(1f);
                setF81(1d);
                setF82("1");
                setF83(1d);
                setF84(true);
                setF85("1");
                setF86("1");
                setF87(true);
                setF88("1");
                setF89("1");
                setF90("1");
                setF91(1);
                setF92(1);
                setF93(1);
                setF94(1);
                setF95(1);
                setF96(1);
                setF97(f97List);
                setF98(f98List);
                setF99(f99List);
            }});

        }
        return complexDTOS;
    }


    public List<ComplexObject> generateComplexObjects(int count) {

        List<ComplexObject> complexObjects = new ArrayList<>();


        for (int i = 0; i < count; i++) {

            List<dk.vv.ufo.server.msvc.grpc.F97> f97List = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                f97List.add(
                    dk.vv.ufo.server.msvc.grpc.F97.newBuilder()
                            .setF1(true)
                            .setF2("1")
                            .setF2("1")
                            .setF3("1")
                            .setF4(false)
                            .setF5("1")
                            .setF6("1")
                            .setF7("1")
                            .build()
                );
            }
            List<dk.vv.ufo.server.msvc.grpc.F98> f98List = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                f98List.add(
                        dk.vv.ufo.server.msvc.grpc.F98.newBuilder()
                                .setF1(1f)
                                .setF2(1f)
                                .setF2(1f)
                                .setF3(1f)
                                .setF4(1f)
                                .setF5(1f)
                                .setF6(1)
                                .setF7(1)
                                .build()
                );
            }

            List<dk.vv.ufo.server.msvc.grpc.F99> f99List = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                f99List.add(
                        dk.vv.ufo.server.msvc.grpc.F99.newBuilder()
                                .setF1(1)
                                .setF2(1)
                                .setF2(1)
                                .setF3(1)
                                .setF4("1")
                                .setF5("1")
                                .setF6("1")
                                .setF7("1")
                                .build()
                );
            }

            ComplexObject.Builder complexObjectBuilder = ComplexObject.newBuilder();

            // Set values for each field in ComplexObject
            complexObjectBuilder.setF1(1f);
            complexObjectBuilder.setF2(2f);
            complexObjectBuilder.setF3(3f);
            complexObjectBuilder.setF4("1");
            complexObjectBuilder.setF5(1);
            complexObjectBuilder.setF6("1");
            complexObjectBuilder.setF7(1);
            complexObjectBuilder.setF8("1");
            complexObjectBuilder.setF9("1");
            complexObjectBuilder.setF10("1");
            complexObjectBuilder.setF11(1);
            complexObjectBuilder.setF12(1);
            complexObjectBuilder.setF13(true);
            complexObjectBuilder.setF14(1);
            complexObjectBuilder.setF15(1);
            complexObjectBuilder.setF16(1f);
            complexObjectBuilder.setF17(1);
            complexObjectBuilder.setF18(1f);
            complexObjectBuilder.setF19(1f);
            complexObjectBuilder.setF20(1f);
            complexObjectBuilder.setF21("1");
            complexObjectBuilder.setF22(1);
            complexObjectBuilder.setF23(1d);
            complexObjectBuilder.setF24("1");
            complexObjectBuilder.setF25(1d);
            complexObjectBuilder.setF26(1d);
            complexObjectBuilder.setF27("1");
            complexObjectBuilder.setF28(1);
            complexObjectBuilder.setF29("1");
            complexObjectBuilder.setF30("1");
            complexObjectBuilder.setF31(1);
            complexObjectBuilder.setF32(1);
            complexObjectBuilder.setF33(true);
            complexObjectBuilder.setF34(1);
            complexObjectBuilder.setF35(1);
            complexObjectBuilder.setF36(1f);
            complexObjectBuilder.setF37(true);
            complexObjectBuilder.setF38(1f);
            complexObjectBuilder.setF39(1f);
            complexObjectBuilder.setF40(1f);
            complexObjectBuilder.setF41(1d);
            complexObjectBuilder.setF42("1");
            complexObjectBuilder.setF43(1d);
            complexObjectBuilder.setF44("1");
            complexObjectBuilder.setF45(1d);
            complexObjectBuilder.setF46("1");
            complexObjectBuilder.setF47(true);
            complexObjectBuilder.setF48("1");
            complexObjectBuilder.setF49("1");
            complexObjectBuilder.setF50("1");
            complexObjectBuilder.setF51(1);
            complexObjectBuilder.setF52(1d);
            complexObjectBuilder.setF53(1);
            complexObjectBuilder.setF54(1d);
            complexObjectBuilder.setF55(1);
            complexObjectBuilder.setF56(false);
            complexObjectBuilder.setF57(1f);
            complexObjectBuilder.setF58(1f);
            complexObjectBuilder.setF59(false);
            complexObjectBuilder.setF60(1f);
            complexObjectBuilder.setF61("1");
            complexObjectBuilder.setF62("1");
            complexObjectBuilder.setF63(1d);
            complexObjectBuilder.setF64(true);
            complexObjectBuilder.setF65("1");
            complexObjectBuilder.setF66(1d);
            complexObjectBuilder.setF67(true);
            complexObjectBuilder.setF68(1d);
            complexObjectBuilder.setF69("1");
            complexObjectBuilder.setF70("1");
            complexObjectBuilder.setF71(1);
            complexObjectBuilder.setF72(1);
            complexObjectBuilder.setF73(1);
            complexObjectBuilder.setF74(1);
            complexObjectBuilder.setF75(1);
            complexObjectBuilder.setF76(1f);
            complexObjectBuilder.setF77(1f);
            complexObjectBuilder.setF78(1f);
            complexObjectBuilder.setF79(1f);
            complexObjectBuilder.setF80(1f);
            complexObjectBuilder.setF81(1d);
            complexObjectBuilder.setF82("1");
            complexObjectBuilder.setF83(1);
            complexObjectBuilder.setF84(true);
            complexObjectBuilder.setF85("1");
            complexObjectBuilder.setF86("1");
            complexObjectBuilder.setF87(true);
            complexObjectBuilder.setF88("1");
            complexObjectBuilder.setF89("1");
            complexObjectBuilder.setF90("1");
            complexObjectBuilder.setF91(1);
            complexObjectBuilder.setF92(1);
            complexObjectBuilder.setF93(1);
            complexObjectBuilder.setF94(1);
            complexObjectBuilder.setF95(1);
            complexObjectBuilder.setF96(1);
            complexObjectBuilder.addAllF97(f97List);
            complexObjectBuilder.addAllF98(f98List);
            complexObjectBuilder.addAllF99(f99List);

            complexObjects.add(complexObjectBuilder.build());
        }
        return complexObjects;
    }




}
