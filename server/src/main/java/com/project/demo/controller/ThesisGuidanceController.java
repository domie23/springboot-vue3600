package com.project.demo.controller;

import com.project.demo.entity.ThesisGuidance;
import com.project.demo.service.ThesisGuidanceService;
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
 * 论文指导：(ThesisGuidance)表控制层
 *
 */
@RestController
@RequestMapping("/thesis_guidance")
public class ThesisGuidanceController extends BaseController<ThesisGuidance, ThesisGuidanceService> {

    /**
     * 论文指导对象
     */
    @Autowired
    public ThesisGuidanceController(ThesisGuidanceService service) {
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
