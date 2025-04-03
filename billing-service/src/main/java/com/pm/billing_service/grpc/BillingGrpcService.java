package com.pm.billing_service.grpc;

import billing.BillingRequest;
import billing.BillingResponse;
import billing.BillingServiceGrpc.BillingServiceImplBase;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BillingGrpcService extends BillingServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);

    @Override
    public void createBillingAccount(BillingRequest billingRequest, StreamObserver<BillingResponse> respObserver) {
        log.info("createBillingAccount request received {}", billingRequest.toString());

        // Lógica de negócios - ex: salvar no banco, realizar cálculos, etc

        BillingResponse response = BillingResponse.newBuilder()
            .setAccountId("21213132")
            .setStatus("Active")
            .build();

        respObserver.onNext(response);
        respObserver.onCompleted();
    }
}
