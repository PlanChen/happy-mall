#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../cms.jar &
tail -f logs/cms-api.log
