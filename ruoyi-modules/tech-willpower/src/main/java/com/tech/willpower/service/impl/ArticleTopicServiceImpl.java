package com.tech.willpower.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tech.willpower.entity.ArticleTopic;
import com.tech.willpower.mapper.ArticleTopicMapper;
import com.tech.willpower.service.ArticleTopicService;
import org.springframework.stereotype.Service;

/**
* @author willyyz163.com
* @description 针对表【article_topic(文章专题关联表)】的数据库操作Service实现
* @createDate 2023-04-10 22:44:11
*/
@Service
public class ArticleTopicServiceImpl extends ServiceImpl<ArticleTopicMapper, ArticleTopic>
implements ArticleTopicService{

}
