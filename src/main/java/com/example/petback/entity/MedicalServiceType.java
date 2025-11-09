package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;



@Data

@NoArgsConstructor

@AllArgsConstructor

// JPA实体注解
@Entity
// JPA表名注解
@TableName("medical_service_types")
public class MedicalServiceType {


    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Swagger注解，用于API文档的字段描述
    @Schema(description = "服务类型的唯一标识符", accessMode = Schema.AccessMode.READ_ONLY)
    private Integer id;


    // Swagger注解，用于API文档的字段描述
    @Schema(description = "医疗服务的类型名称", required = true)
    private String name;


    // Swagger注解，用于API文档的字段描述
    @Schema(description = "对医疗服务类型的详细描述")
    private String description;
}