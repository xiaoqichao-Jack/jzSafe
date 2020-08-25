package com.jzSafe.project.monitor.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jzSafe.framework.web.controller.BaseController;
import com.jzSafe.framework.web.domain.AjaxResult;
import com.jzSafe.framework.web.domain.Server;

/**
 * 服务器监控
 * 
 * @author xiaoqichao
 */
@RestController
@RequestMapping("/monitor/server")
public class ServerController extends BaseController
{
    @GetMapping()
    public AjaxResult getInfo() throws Exception
    {
        Server server = new Server();
        server.copyTo();
        return AjaxResult.success(server);
    }
}
