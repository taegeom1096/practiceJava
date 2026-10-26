package com.board.boardbackend.dto;

import com.board.boardbackend.entity.Post;
import java.time.Instant;

public record PostResponse(Long id, String title, String content, UserResponse author,
                           Instant createdAt, Instant updatedAt) {
    public static PostResponse from(Post post) {
        return new PostResponse(post.getId(), post.getTitle(), post.getContent(),
                new UserResponse(post.getAuthor().getId(), post.getAuthor().getNickname()),
                post.getCreatedAt(), post.getUpdatedAt());
    }
}
