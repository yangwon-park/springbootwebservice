package com.jojoldu.admin.service.posts;

import com.jojoldu.admin.domain.posts.Posts;
import com.jojoldu.admin.domain.posts.PostsRepository;
import com.jojoldu.admin.web.dto.PostsResponseDTO;
import com.jojoldu.admin.web.dto.PostsSaveRequestDTO;
import com.jojoldu.admin.web.dto.PostsUpdateRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDTO requestsDTO) {
        return postsRepository.save(requestsDTO.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDTO requestDTO) {
        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        posts.update(requestDTO.getTitle(), requestDTO.getContent());
        return id;
    }

    public PostsResponseDTO findById(Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. Id = " + id));

        return new PostsResponseDTO(entity);
    }
}
