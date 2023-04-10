package com.tech.willpower.controller;

import com.tech.willpower.entity.Article;
import com.tech.willpower.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author willyyz163.com
 */
@RestController
@RequestMapping("/api/articles")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody Article article) {
        // 保存文章信息
        articleService.saveArticle(article);

        return ResponseEntity.ok("文章创建成功");
    }

}
