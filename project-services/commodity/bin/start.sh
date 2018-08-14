#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../commodity.jar &
tail -f logs/commodity-api.log
