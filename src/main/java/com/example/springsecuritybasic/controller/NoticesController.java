package com.example.springsecuritybasic.controller;

import com.example.springsecuritybasic.model.Notice;
import com.example.springsecuritybasic.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class NoticesController {
    @Autowired
    private NoticeRepository noticeRepository;

    @GetMapping("/notices")
    public ResponseEntity<List<Notice>> getNotices(@RequestParam Integer noticeId) {
        List<Notice> notices = noticeRepository.findAllByNoticeId(noticeId);
        if (notices != null ) {
            return ResponseEntity.ok()
                    .cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS))
                    .body(notices);
        }else {
            return null;
        }
    }
}
