package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Data
@TableName("pet_grooming_services")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "宠物美容服务实体类")
public class PetGroomingService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "服务的唯一标识符，自动递增")
    private Integer id;

    @Schema(description = "宠物的名称")
    private String petName;

    @Schema(description = "预约服务的用户名")
    private String username;

    @Schema(description = "服务进行的日期")
//    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private LocalDate serviceDate;

    @Schema(description = "美容服务的类型")
    private String serviceType;

    @Schema(description = "记录创建的时间戳，默认为当前时间")
//    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate createdAt;
    @Schema(description = "服务状态")
    private String status;
}