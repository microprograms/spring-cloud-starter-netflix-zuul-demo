# Zuul 网关

- `默认端口：` 5555
- `路由规则：` http://localhost:5555/{服务名}/{路径}
- `路由示例：` http://localhost:5555/demo2/health http://localhost:5555/demo1/health


#### 版本依赖
- `Jdk` 1.8 及以上
- `Spring Boot` 2.3.9.RELEASE
- `Spring Cloud` Hoxton.SR10


#### 编译打包

```shell
sh bin/package.sh
```

#### 启动

```shell
sh bin/start.sh
```

#### 查看控制台输出

```shell
tail -f server.nohup.out
```

#### 停止

```shell
sh bin/stop.sh
```
