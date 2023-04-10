package com.tech.willpower.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 文章专题关联表
 * @TableName article_topic
 */
@TableName(value ="article_topic")
@Data
public class ArticleTopic implements Serializable {
    /**
     * 文章ID
     */
    @TableId
    private Integer articleId;

    /**
     * 专题ID
     */
    @TableId
    private Integer topicId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}