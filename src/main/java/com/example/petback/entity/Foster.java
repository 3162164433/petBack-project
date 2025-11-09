package com.example.petback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "寄养表")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("foster")
public class Foster {
    @TableId(type = IdType.AUTO)

    @Schema(description = "id")
    private Integer id;

    @Schema(description = "用户id")
    private Integer userId;
    @Schema(description = "宠物昵称")
    private String name;
    @Schema(description = "寄养时间")
    private String time;
    @Schema(description = "寄养天数")
    private Integer days;
    @Schema(description = "寄养状态")
    private String status;
    @Schema(description = "寄养房间id")
    private Integer roomId;

    @TableField(exist = false)
    @Schema(description = "寄养用户")
    private String userName;
    @TableField(exist = false)
    @Schema(description = "房间名称")
    private String roomName;

}
