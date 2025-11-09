package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Schema(description = "宠物表")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("animal")
public class Animal {
    @TableId(type = IdType.AUTO)
    @Schema(description = "自增主键")
    private Integer id;
    @Schema(description = "宠物头像")
    private String img;
    @Schema(description = "宠物昵称")
    private String name;
    @Schema(description = "宠物性别")
    private String sex;
    @Schema(description = "宠物年龄")
    private Integer age;
    @Schema(description = "宠物种类")
    private String type;
    @Schema(description = "宠物状态")
    private String status;
    @Schema(description = "注册日期")
    private LocalDate registrationDate;
    @Schema(description = "行为特征")
    private String behaviorTraits;
    @Schema(description = "绝育状况")
    private String sterilizationStatus;
    @Schema(description = "颜色")
    private String  color;
    @Schema(description = "训练状况")
    private String       trainingLevel;
    @Schema(description = "特殊要求")
    private String     specialNeeds;
    private String descr;
    @Schema(description = "宠物品种")
    private String breed;
}
