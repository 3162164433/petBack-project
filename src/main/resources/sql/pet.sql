-- 创建宠物推荐记录表
CREATE TABLE IF NOT EXISTS `pet_recommendation` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '推荐记录ID',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `user_query` varchar(500) NOT NULL COMMENT '用户查询内容',
  `recommendation_type` varchar(50) NOT NULL COMMENT '推荐类型：PET(宠物)、GOODS(宠物用品)、SERVICE(宠物服务)',
  `recommended_item_id` int(11) NOT NULL COMMENT '推荐的项目ID',
  `reason` text COMMENT '推荐理由',
  `score` double DEFAULT NULL COMMENT '推荐匹配分数',
  `created_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`),
  KEY `idx_recommendation_type` (`recommendation_type`),
  KEY `idx_created_at` (`created_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='宠物智能推荐记录表'; 