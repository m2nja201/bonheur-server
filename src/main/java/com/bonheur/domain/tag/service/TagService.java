package com.bonheur.domain.tag.service;

import com.bonheur.domain.tag.model.dto.CreateTagRequest.tagList;
import com.bonheur.domain.tag.model.dto.CreateTagResponse;

import java.util.List;

public interface TagService {
    CreateTagResponse createTags(Long memberId, List<tagList> tags);
}
