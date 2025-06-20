package com.project.demo.controller;

import com.project.demo.entity.ThesisTitle;
import com.project.demo.service.ThesisTitleService;
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
 * 论文题目：(ThesisTitle)表控制层
 *
 */
@RestController
@RequestMapping("/thesis_title")
public class ThesisTitleController extends BaseController<ThesisTitle, ThesisTitleService> {

    /**
     * 论文题目对象
     */
    @Autowired
    public ThesisTitleController(ThesisTitleService service) {
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
