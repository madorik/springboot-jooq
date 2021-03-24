package com.jooq.demo.repository;

import com.jooq.demo.dto.NoticeDto;
import jooq.demo_dsl.tables.JNotice;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.jooq.impl.DSL.val;

@Slf4j
@Repository
public class NoticeRepository {

    private final DSLContext dslContext;

    public NoticeRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<NoticeDto> all() {
        JNotice N = JNotice.NOTICE;
        return dslContext.select(
                N.IDX,
                N.AUTHOR,
                N.CONTENT,
                N.TITLE,
                N.CONTENT,
                N.UPDATE_DATE
        )
        .from(N)
        .fetchInto(NoticeDto.class);
    }

    public Integer save(NoticeDto noticeDto) {
        JNotice N = JNotice.NOTICE;
        return dslContext.insertInto(N)
                .set(N.AUTHOR, noticeDto.getAuthor())
                .set(N.TITLE, noticeDto.getTitle())
                .set(N.CONTENT, noticeDto.getContent())
        .execute();
    }
}
