package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("pet_ai_chat")
public class PetAiChat {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer userId;
    private Integer petId;
    private String message;
    private String response;
    private LocalDateTime createdAt;
} 