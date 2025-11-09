package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "宠物领养")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("adopt")
public class Adopt {
    @TableId(type = IdType.AUTO)
    @Schema(description = "自增主键")
    private Integer id;

    @Schema(description = "用户id")
    private Integer userId;

    @Schema(description = "宠物id")
    private Integer animalId;
    @Schema(description = "领养时间")
    private String time;
    @Schema(description = "领养状态")
    private String status;

    @Schema(description = "审核意见")
    private String reviewComment;

    @Schema(description = "审核人ID")
    private Integer reviewerId;

    @Schema(description = "审核时间")
    private String reviewTime;

    @TableField(exist = false)
    @Schema(description = "用户名")
    private String userName;
    @Schema(description = "宠物头像")
    @TableField(exist = false)
    private String animalImg;
    @Schema(description = "宠物昵称")
    @TableField(exist = false)
    private String animalName;

    @Schema(description = "审核人姓名")
    @TableField(exist = false)
    private String reviewerName;
}
