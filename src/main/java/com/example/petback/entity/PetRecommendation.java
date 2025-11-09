package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("pet_recommendation")
public class PetRecommendation {
    @TableId(type = IdType.AUTO)
    private Integer id;
    
    private Integer userId;
    
    private String userQuery;
    
    private String recommendationType; // 推荐类型: PET(宠物), GOODS(宠物用品), GROOMING(美容服务), TRAINING(训练服务), MEDICAL(医疗服务), FOSTER(寄养服务)
    
    private Integer recommendedItemId; // 推荐的宠物ID、商品ID或服务ID
    
    private String serviceType; // 服务类型，当recommendationType为服务类型时使用
    
    private String reason; // 推荐理由
    
    private Double score; // 推荐匹配分数
    
    private LocalDateTime createdAt;
} 