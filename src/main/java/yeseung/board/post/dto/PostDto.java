package yeseung.board.post.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PostDto {
    private Long postId;
    private String title;
    private String author;
}
