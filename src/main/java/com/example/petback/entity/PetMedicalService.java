package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@TableName( "pet_medical_services")
@Schema(description = "宠物医疗服务实体类")
public class PetMedicalService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "服务的唯一标识符，自动递增")
    private Integer id;

    @Schema(description = "宠物的名称")
    @Column(name = "pet_name", nullable = false)
    private String petName;

    @Schema(description = "预约服务的用户名")
    @Column(name = "username", nullable = false)
    private String username;

    @Schema(description = "医疗服务的类型")
    @Column(name = "type", nullable = false)
    private String type;

    @Schema(description = "服务日期")
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Schema(description = "服务的描述信息")
    @Column(name = "description")
    private String description;

    @Schema(description = "记录创建的时间戳，默认为当前时间")
    @Column(name = "created_at", updatable = false)
    private LocalDate createdAt;
    @Schema(description = "服务状态")
    private String status;
}