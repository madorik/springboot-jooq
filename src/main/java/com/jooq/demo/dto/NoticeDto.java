package com.jooq.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class NoticeDto {

    @JsonProperty("idx")
    private Long idx;

    @JsonProperty("author")
    private Integer author;

    @JsonProperty("title")
    private String title;

    @JsonProperty("content")
    private String content;

    @JsonProperty("create_date")
    private Date createDate;

    @JsonProperty("update_date")
    private Date updateDate;

    public static NoticeDto create() {
        return new NoticeDto();
    }

    @Override
    public String toString() {
        return "NoticeDto {" +
                "idx=" + idx +
                ", author=" + author +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
