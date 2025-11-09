package com.example.petback.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Schema(description = "订单金额实体类")

@NoArgsConstructor
@AllArgsConstructor
public class OrdersAmount {
    @Schema(description = "总额")
    private Double totalAmount;
}
