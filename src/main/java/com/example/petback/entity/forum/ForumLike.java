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

@Schema(description = "论坛点赞实体类")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("forum_likes")
public class ForumLike {
    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "自增主键")
    private Integer id;

    @Schema(description = "帖子ID")
    private Integer postId;

    @Schema(description = "点赞用户ID")
    private Integer userId;

    @Schema(description = "点赞时间")
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;
}