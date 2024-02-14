package com.jhpark.mqttpublisherpractice.service;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.springframework.stereotype.Service;

@Service
public class MqttPublisherService {

    private final MqttClient mqttClient;

    public MqttPublisherService(MqttClient mqttClient) {
        this.mqttClient = mqttClient;
    }

    public void sendMessage(String topic, String message) {
        try {
            mqttClient.publish(topic, new MqttMessage(message.getBytes()));
        } catch (MqttException e) {
            throw new RuntimeException(e);
        }
    }
}
