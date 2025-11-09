package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Schema(description = "宠物用品表")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("goods")
public class Goods {
    @TableId(type = IdType.AUTO)
    @Schema(description = "id")
    private Integer id;

    @Schema(description = "宠物用品名")
    private String name;

    @Schema(description = "宠物用品照片")
    private String img;

    @Schema(description = "宠物用品描述")
    private String desrc;

    @Schema(example = "29.99", description = "价格")
    private BigDecimal price;

    @Schema(description = "库存")
    private Integer num;

}
