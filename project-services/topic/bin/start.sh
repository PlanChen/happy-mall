#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../content.jar &
tail -f logs/content-api.log
