package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Schema(description = "订单实体")
@TableName("orders")
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
    @TableId(type = IdType.AUTO)
    @Schema(example = "1", description = "唯一标识符")
    private Integer id;
    @Schema(example = "1", description = "订单号")
    private String orderNo;

    @Schema(example = "1", description = "货品id")
    private Integer goodsId;
    @Schema(example = "1000", description = "商品数量")
    // 商品数量
    private Integer num;
    @Schema(example = "1", description = "用户id")
    // 用户ID，外键
    private Integer userId;
    @Schema(example = "W_Pay", description = "订单状态")
    // 订单状态
    private String status;
    @Schema(example = "2024-07-28 12:56:33", description = "分类名称")
    // 订单创建时间
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp time;
    @Schema(example = "小明", description = "用户名")
    @TableField(exist = false)
    private String username;
    @Schema(example = "白菜", description = "货品名")
    @TableField(exist = false)
    private String goodsName;
    @Schema(example = "100.00", description = "订单总金额")
    @TableField(exist = false)
    private BigDecimal totalAmount;

}




