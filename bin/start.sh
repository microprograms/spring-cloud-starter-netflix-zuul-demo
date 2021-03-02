#!/bin/bash

nohup java -Xms1024m -Xmx1024m -jar target/spring-cloud-starter-netflix-zuul-demo-1.0.0.jar > server.nohup.out 2>&1 &
echo $! > bin/server.pid
