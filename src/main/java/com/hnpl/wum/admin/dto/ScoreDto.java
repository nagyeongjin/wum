package com.hnpl.wum.admin.dto;

import lombok.Data;

@Data
public class ScoreDto {

    private Long scoreSeq;
    private Long userSeq;
    private Long movieSeq;
    private Integer score;
    private String id;
    private String reviewContent;
    private Integer reviewLike;
    private String postDate;
    private Long likeSeq;
}
