* 执行 `mvn package ` 打包 jar
* 根目录下执行 `docker-compose build` 构建镜像
* 需要映射的 IP 地址写入 `docker-compose.yml` 中的 `extra_host` 中
* 执行 `docker-compose up -d` 启动容器
* ``` curl http://localhost:7001/{hostname} ``` 测试该域名是否映射成功
> docker run 示例
* `docker run -d --add-host example.com:192.168.1.100 -p 7001:7001 registry.likui.com/docker-network-demo:1.0-SNAPSHOT`