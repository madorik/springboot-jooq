package com.jooq.demo.service;

import com.jooq.demo.dto.NoticeDto;
import com.jooq.demo.repository.NoticeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    public List<NoticeDto> getNoticeAll() {
        return noticeRepository.all();
    }

    public Integer save(NoticeDto noticeDto) {
        return noticeRepository.save(noticeDto);
    }
}
