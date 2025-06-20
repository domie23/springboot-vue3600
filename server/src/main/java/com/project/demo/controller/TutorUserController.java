package com.project.demo.controller;

import com.project.demo.entity.TutorUser;
import com.project.demo.service.TutorUserService;
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
 * 导师用户：(TutorUser)表控制层
 *
 */
@RestController
@RequestMapping("/tutor_user")
public class TutorUserController extends BaseController<TutorUser, TutorUserService> {

    /**
     * 导师用户对象
     */
    @Autowired
    public TutorUserController(TutorUserService service) {
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
