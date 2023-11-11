package org.acme;

import com.google.protobuf.ByteString;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public final class WeeklyPlanerService implements WeeklyPlaner {

    @Override
    public Uni<WeeklyPlanReply> createWeeklyPlan(WeeklyPlanRequest request) {

        //language=JSON
        final String jsonString = " {\n" +
                "  \"a\": 5,\n" +
                "   \"b\": 2\n" +
                "}";
        return Uni.createFrom().item(() ->
                WeeklyPlanReply.newBuilder().setReport(ByteString.copyFrom("abc".getBytes())).build()
        );
    }
}