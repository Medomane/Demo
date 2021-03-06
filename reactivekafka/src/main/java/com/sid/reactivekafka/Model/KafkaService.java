package com.sid.reactivekafka.Model;

import reactor.core.publisher.Flux;
import reactor.kafka.receiver.ReceiverRecord;

public interface KafkaService {

    Flux<ReceiverRecord<String, String>> getTestTopicFlux();
}
