package com.jooq.demo;

import com.jooq.demo.dto.NoticeDto;
import com.jooq.demo.service.NoticeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NoticeServiceTest extends IntegrationTest {

    @Autowired
    private NoticeService noticeService;

    @Test
    public void save() {
        NoticeDto noticeDto = NoticeDto.create();
        noticeDto.setAuthor(1);
        noticeDto.setTitle("TITLE");
        noticeDto.setContent("CONTENT");

        noticeService.save(noticeDto);
    }

    @Test
    public void list() {
        List<NoticeDto> list = noticeService.getNoticeAll();
        for (NoticeDto dto : list) {
            System.out.println(dto.toString());
        }
    }
}
