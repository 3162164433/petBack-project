package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Schema(description = "宠物健康")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID")
    private Long id;

    @Schema(description = "宠物ID")
    private Long petId;
    @Schema(description = "宠物姓名")


    @TableField(exist = false)
    private String petName;
    @Schema(description = "记录日期")
    private LocalDate recordDate;

    @Schema(description = "体温")
    private Double temperature;

    @Schema(description = "体重")
    private Double weight;

    @Schema(description = "身高")
    private Double height;

    @Schema(description = "疫苗接种日期")
    private LocalDate vaccinationDate;

    @Schema(description = "健康状态")
    private String healthStatus;
}