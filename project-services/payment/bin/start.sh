#!/bin/bash

nohup java -Xms100m -Xmx520m -jar ../payment.jar &
tail -f logs/payment-api.log
