package com.jooq.demo;

import jooq.demo_dsl.tables.JNotice;
import jooq.demo_dsl.tables.records.JNoticeRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RecordQueryTest extends IntegrationTest {

    @Autowired
    private DSLContext dslContext;

    @Test
    public void record() {
        JNotice NOTICE = JNotice.NOTICE;
        Result<JNoticeRecord> result = dslContext.selectFrom(NOTICE).fetch();
        System.out.println(result);
    }
}
