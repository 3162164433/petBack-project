package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@TableName("home_slider")
public class HomeSlider {

    @Schema(description = "轮播图的唯一标识符", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Schema(description = "轮播图的名称或标题")
    private String name;

    @Schema(description = "对轮播图内容的简短描述")
    private String desrc;

    @Schema(description = "轮播图的图片链接")
    private String img;
}