package com.jooq.demo.repository;

import com.jooq.demo.dto.NoticeDto;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class NoticeRepository {

    private final DSLContext dslContext;

    public NoticeRepository(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<NoticeDto> all() {
        sample_dsl.tables.Notice N = sample_dsl.tables.Notice.NOTICE;
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
}
