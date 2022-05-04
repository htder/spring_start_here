package repositories;

import model.Comment;

public interface CommentRepository {
    void saveComment(Comment comment);
}
