package com.example.petback.entity.forum;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Schema(description = "论坛分类实体类")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("forum_categories")
public class ForumCategory {
    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "自增主键")
    private Integer id;

    @Schema(description = "分类名称")
    private String name;

    @Schema(description = "分类编码(daily/knowledge/help)")
    private String code;

    @Schema(description = "分类描述")
    private String description;

    @Schema(description = "创建时间")
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}