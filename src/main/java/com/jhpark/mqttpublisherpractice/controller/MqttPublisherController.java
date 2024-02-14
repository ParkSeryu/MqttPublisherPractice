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
    public void SendTopicAndMessage(@RequestBody MqttRequestDto mqttRequestDto) {
        mqttPublisherService.sendMessage(mqttRequestDto.getTopic(), mqttRequestDto.getMessage());
    }
}
