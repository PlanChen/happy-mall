#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../order.jar &
tail -f logs/order-api.log
