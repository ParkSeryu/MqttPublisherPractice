package com.jhpark.mqttpublisherpractice.controller;

import com.jhpark.mqttpublisherpractice.dto.MqttRequestDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MqttPubControllerTest {

    @Autowired
    MqttPublisherController mqttPublisherController;

    @DisplayName("토픽이랑 메시지가 잘 갔다 왔는지")
    @Test
    public void sendTopicAndMessageTest() {
        //given
        String topic = "temperature";
        String message = "21C";


        //when
        MqttRequestDto mqttRequestDto = new MqttRequestDto(topic, message);

        MqttRequestDto mqttRequestDtoResponseEntity = mqttPublisherController.SendTopicAndMessage(mqttRequestDto);

        //then
        assertThat(mqttRequestDto).isEqualTo(mqttRequestDtoResponseEntity);
    }

}