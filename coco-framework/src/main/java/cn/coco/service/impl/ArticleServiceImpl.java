package cn.coco.service.impl;

import cn.coco.domain.ResponseResult;
import org.springframework.stereotype.Service;
import cn.coco.domain.entity.Article;
import cn.coco.service.ArticleService;
import cn.coco.mapper.ArticleMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService{
    @Override
    public ResponseResult hotArticleList() {
        return null;
    }
}
