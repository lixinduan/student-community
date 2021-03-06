package com.community.student.dao;

import com.community.student.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> selectCommentsByEntity(int entityType, int entityId, int offset, int limit);

    int selectCountByEntity(int entityType, int entityId);

    int insertComment(Comment comment);

    int deleteComment(int id);

    Comment selectCommentById(int id);

    List<Comment> selectCommentByUserId(int userId, int offset, int limit);

    int selectCountByUserId(int userId);



}
