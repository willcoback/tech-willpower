
-- 文章表
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章ID',
  `title` varchar(255) NOT NULL COMMENT '文章标题',
  `content` text NOT NULL COMMENT '文章内容',
  `status` enum('draft','published') NOT NULL DEFAULT 'draft' COMMENT '文章状态',
  `visibility` enum('public','private') NOT NULL DEFAULT 'public' COMMENT '文章可见性',
  `author_id` int(11) NOT NULL COMMENT '作者ID',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否已删除',
  PRIMARY KEY (`id`),
  KEY `author_id` (`author_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章表';

-- 专题表
CREATE TABLE `topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '专题ID',
  `name` varchar(255) NOT NULL COMMENT '专题名称',
  `description` varchar(1000) DEFAULT NULL COMMENT '专题描述',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='专题表';

-- 文章专题关联表
CREATE TABLE `article_topic` (
  `article_id` int(11) NOT NULL COMMENT '文章ID',
  `topic_id` int(11) NOT NULL COMMENT '专题ID',
  PRIMARY KEY (`article_id`,`topic_id`),
  KEY `topic_id` (`topic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='文章专题关联表';

-- 评论表
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论ID',
  `content` varchar(1000) NOT NULL COMMENT '评论内容',
  `user_id` int(11) NOT NULL COMMENT '评论者ID',
  `article_id` int(11) NOT NULL COMMENT '评论所属文章ID',
  `parent_id` int(11) DEFAULT NULL COMMENT '父级评论ID，0表示没有父级评论',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否已删除',
  PRIMARY KEY (id),
  KEY user_id (user_id),
  KEY article_id (article_id),
  KEY parent_id (parent_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='评论表';
