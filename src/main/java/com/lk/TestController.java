package com.lk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author likui
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(path = "ping/{hostname}")
    public String test01(@PathVariable("hostname") String hostname) {
        // ping 一下指定的域名
        try {
            InetAddress inetAddress = InetAddress.getByName(hostname);
            // 如果域名解析成功，则表示域名存在
            return "Ping successful. IP Address: " + inetAddress.getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            // 如果域名解析失败，则表示域名不存在或无法访问
            return "UnknownHostException: Ping failed. Domain not found or unreachable.";
        }
    }
}
