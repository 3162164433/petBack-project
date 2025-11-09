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

@Schema(description = "论坛帖子实体类")
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("forum_posts")
public class ForumPost {
    @TableId(value = "id", type = IdType.AUTO)
    @Schema(description = "自增主键")
    private Integer id;

    @Schema(description = "发布用户ID")
    private Integer userId;

    @Schema(description = "帖子标题")
    private String title;

    @Schema(description = "帖子内容")
    private String content;

    @Schema(description = "分类ID")
    private Integer categoryId;

    @Schema(description = "标签列表")
    private String tags;

    @Schema(description = "点赞数")
    private Integer likesCount;

    @Schema(description = "评论数")
    private Integer commentsCount;

    @Schema(description = "状态(0-删除,1-正常,2-置顶)")
    private Integer status;

    @Schema(description = "创建时间")
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @Schema(description = "更新时间")
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}