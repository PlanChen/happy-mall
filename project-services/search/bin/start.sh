#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../search.jar &
tail -f logs/search-api.log
