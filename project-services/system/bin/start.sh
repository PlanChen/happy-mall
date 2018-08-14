#!/bin/bash

JVM="-Xms100m -Xmx520m"
Log="logs/admin-system-api.log"

nohup java $JVM -jar ../admin-system.jar &
tail -f $Log
