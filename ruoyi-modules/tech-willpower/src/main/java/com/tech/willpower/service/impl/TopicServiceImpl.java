package com.tech.willpower.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tech.willpower.entity.Topic;
import com.tech.willpower.mapper.TopicMapper;
import com.tech.willpower.service.TopicService;
import org.springframework.stereotype.Service;

/**
* @author willyyz163.com
* @description 针对表【topic(专题表)】的数据库操作Service实现
* @createDate 2023-04-10 22:44:11
*/
@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic>
implements TopicService{

}
