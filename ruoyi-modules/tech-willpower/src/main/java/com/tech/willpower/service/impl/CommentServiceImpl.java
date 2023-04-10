package com.tech.willpower.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tech.willpower.entity.Comment;
import com.tech.willpower.mapper.CommentMapper;
import com.tech.willpower.service.CommentService;
import org.springframework.stereotype.Service;

/**
* @author willyyz163.com
* @description 针对表【comment(评论表)】的数据库操作Service实现
* @createDate 2023-04-10 22:44:11
*/
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
implements CommentService{

}
