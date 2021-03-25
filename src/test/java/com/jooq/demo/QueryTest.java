package com.jooq.demo;

import com.jooq.demo.dto.NoticeDto;
import jooq.demo_dsl.tables.JNotice;
import jooq.demo_dsl.tables.JUser;
import jooq.demo_dsl.tables.records.JNoticeRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public class QueryTest extends IntegrationTest {

    @Autowired
    private DSLContext dslContext;

    @Test
    public void select() {
        JNotice N = JNotice.NOTICE;
        Result<JNoticeRecord> result = dslContext.selectFrom(N).fetch();
        System.out.println(result);
    }

    @Test
    @Transactional
    public void insert() {
        JNotice N = JNotice.NOTICE;
        NoticeDto noticeDto = NoticeDto.create();
        dslContext.insertInto(N)
                .set(N.AUTHOR, noticeDto.getAuthor())
                .set(N.TITLE, noticeDto.getTitle())
                .set(N.CONTENT, noticeDto.getContent())
                .execute();
    }


    @Test
    public void join() {
        JNotice N = JNotice.NOTICE;
        JUser U = JUser.USER;
        List<NoticeDto> list = dslContext
                .select(N.IDX, U.NAME, N.TITLE, N.CONTENT, N.CREATE_DATE, N.UPDATE_DATE)
                .from(N)
                .join(U)
                .on(N.AUTHOR.eq(U.IDX))
                .fetch()
                .into(NoticeDto.class);
        System.out.println(list);
    }
}
