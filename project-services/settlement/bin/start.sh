#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../settlement.jar &
tail -f logs/settlement-api.log
