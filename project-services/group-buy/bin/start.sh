#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../group-buy.jar &
tail -f logs/group-buy-api.log
