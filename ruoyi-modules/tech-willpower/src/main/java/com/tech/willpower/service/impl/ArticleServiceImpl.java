package com.tech.willpower.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tech.willpower.entity.Article;
import com.tech.willpower.service.ArticleService;
import com.tech.willpower.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author willyyz163.com
* @description 针对表【article(文章表)】的数据库操作Service实现
* @createDate 2023-04-10 22:44:11
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
implements ArticleService{

    @Override
    public void saveArticle(Article article) {

    }
}
