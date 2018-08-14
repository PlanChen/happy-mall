#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../admin-system.jar &
tail -f logs/admin-system-api.log
