#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../user.jar &
tail -f logs/user-api.log
