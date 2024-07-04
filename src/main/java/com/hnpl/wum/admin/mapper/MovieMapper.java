package com.hnpl.wum.admin.mapper;

import com.hnpl.wum.admin.dto.MovieDto;
import com.hnpl.wum.admin.dto.MovieMainDto;
import com.hnpl.wum.admin.dto.ScoreDto;
import com.hnpl.wum.require.dto.RequireDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MovieMapper {
    int insertMovie(MovieDto movieDto);

    List<MovieDto> listAllMovie();

    List<MovieDto> movieListPage(Map map);

    List<MovieDto> mainSearchQuery(Map map);

    int countAllMovie(Map map);

    List<MovieMainDto> mainSelect(Map map);

    MovieDto movieDetail(Long movieSeq);

    List<MovieDto> moviePoster(Long movieSeq);

    MovieDto editMovie(Long movieSeq);

    int updateMovie(MovieDto movieDto);

    void deleteMovie(Long movieSeq);

    int insertWish(Map map);

    int cancelWish(Map map);

    Long checkWish(Map map);

    int insertReview(Map map);

    List<ScoreDto> showReview(Long movieSeq);

    //리뷰디테일
    ScoreDto reviewDetail(Long movieSeq);

    //추천추가
    int insertRecommend(Map map);
    //추천삭제
    int removeRecommend(Map map);
    //추천수 변경
    int changeRecommend(Map map);
    //추천했는지 확인
    Long userCheck(Map map);
}
