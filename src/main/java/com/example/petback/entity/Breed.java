package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "品种表")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("breed")
public class Breed {
    @TableId(type = IdType.AUTO)

    @Schema(description = "品种id")
    private  Integer breedId;
    @Schema(description = "品种名称")
    private String breedName;
}
