#!/bin/bash

nohup java -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8888  -Xms100m -Xmx520m -jar ../group-buy.jar &
tail -f nohup.out
