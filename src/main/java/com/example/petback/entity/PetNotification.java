package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Schema(description = "用户通知")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pet_notification")
public class PetNotification {
    
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    
    @Schema(description = "用户ID")
    private Integer userId;
    
    @Schema(description = "推送消息")
    private String message;
    
    @Schema(description = "时间戳")
    private LocalDateTime timestamp;
    
    @Schema(description = "状态")
    private String status;
    
    @TableField(exist = false)
    private String username;
} 