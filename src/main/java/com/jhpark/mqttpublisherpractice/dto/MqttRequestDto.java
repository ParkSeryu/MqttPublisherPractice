package com.jhpark.mqttpublisherpractice.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MqttRequestDto {
    private String topic;
    private String message;


}
