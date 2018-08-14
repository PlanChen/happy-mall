#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../coupon.jar &
tail -f logs/coupon-api.log
