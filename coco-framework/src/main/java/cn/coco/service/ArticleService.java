package cn.coco.service;

import cn.coco.domain.ResponseResult;
import cn.coco.domain.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
