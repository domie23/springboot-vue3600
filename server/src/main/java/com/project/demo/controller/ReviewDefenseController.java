package com.project.demo.controller;

import com.project.demo.entity.ReviewDefense;
import com.project.demo.service.ReviewDefenseService;
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
 * 评审答辩：(ReviewDefense)表控制层
 *
 */
@RestController
@RequestMapping("/review_defense")
public class ReviewDefenseController extends BaseController<ReviewDefense, ReviewDefenseService> {

    /**
     * 评审答辩对象
     */
    @Autowired
    public ReviewDefenseController(ReviewDefenseService service) {
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
