package com.jhpark.mqttpublisherpractice.controller;

import com.jhpark.mqttpublisherpractice.dto.MqttRequestDto;
import com.jhpark.mqttpublisherpractice.service.MqttPublisherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttPublisherController {

    MqttPublisherService mqttPublisherService;

    public MqttPublisherController(MqttPublisherService mqttPublisherService) {
        this.mqttPublisherService = mqttPublisherService;
    }

    @PostMapping("/mqtt/publish")
    public MqttRequestDto SendTopicAndMessage(@RequestBody MqttRequestDto mqttRequestDto) {
//        ResponseEntity<MqttRequestDto>
        mqttPublisherService.sendMessage(mqttRequestDto.getTopic(), mqttRequestDto.getMessage());

        MqttRequestDto mock = new MqttRequestDto("test", "test");
        return mock;
    }

    ;
}
