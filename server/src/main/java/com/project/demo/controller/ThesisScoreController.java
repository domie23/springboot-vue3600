package com.project.demo.controller;

import com.project.demo.entity.ThesisScore;
import com.project.demo.service.ThesisScoreService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 论文成绩：(ThesisScore)表控制层
 *
 */
@RestController
@RequestMapping("/thesis_score")
public class ThesisScoreController extends BaseController<ThesisScore, ThesisScoreService> {

    /**
     * 论文成绩对象
     */
    @Autowired
    public ThesisScoreController(ThesisScoreService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
