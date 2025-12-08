#!/bin/sh
cd .. && ./gradlew clean build && cd docker && ./build-image.sh && cd ../stub-compose
