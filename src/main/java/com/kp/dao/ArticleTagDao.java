package com.kp.dao;

import com.kp.domain.ArticleTag;
import com.kp.domain.BackTag;

import java.util.List;

public interface ArticleTagDao {
    //插入标签
    public int insertTag(ArticleTag articleTag);
    //删除标签
    public int deleteTag(List<String> list);
    //更新标签
    public int updateTag(ArticleTag articleTag);
    //后台获取所有标签及类型、类型说明、类型id
    public List<BackTag> findBackTag();
    //后台获取所有标签数量
    int getTotalTagConunt();

    //查询所有的标签
    List<ArticleTag> listArticleTag();

}
